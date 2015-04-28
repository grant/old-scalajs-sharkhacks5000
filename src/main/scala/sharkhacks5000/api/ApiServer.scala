package sharkhacks5000.api

import java.util

import io.dropwizard.jetty.ConnectorFactory
import io.dropwizard.server.ServerFactory
import io.dropwizard.{Configuration, Application}
import io.dropwizard.setup.Environment

import java.lang.reflect.Field

import sharkhacks5000.api.health.ApiHealth
import sharkhacks5000.api.resources.IndexResource

/**
 * Runner for the API server.
 */

class ApiServer(port: Int) extends Application[ApiConfiguration] {

  private final val API_HEALTH_CHECK: String = "api_health_check"

  /**
   * SUPER HACK
   * Changes DW's port using reflection
   * @param config The server's config
   */
  def changePortHack(config: ApiConfiguration): Unit = {
    val serverField = config.getClass.getSuperclass.getDeclaredField("server")
    serverField.setAccessible(true)
    val server = serverField.get(config)

    val applicationConnectorsField = server.getClass.getDeclaredField("applicationConnectors")
    applicationConnectorsField.setAccessible(true)
    val ac = applicationConnectorsField.get(server).asInstanceOf[util.ArrayList[ConnectorFactory]].get(0)

    val portField = ac.getClass.getDeclaredField("port")
    portField.setAccessible(true)
    portField.set(ac, port)
  }

  override def run(config: ApiConfiguration, environment: Environment): Unit = {
    changePortHack(config)

    // Setup resources
    val indexResource: IndexResource = new IndexResource

    // Endpoints
    // /
    environment.jersey().register(indexResource)

    // Health Check
    val apiHealth: ApiHealth = new ApiHealth
    environment.healthChecks().register(API_HEALTH_CHECK, apiHealth)
  }
}

/**
 * Starts the server at `localhost:PORT`
 */
object Main {
  private final val DEFAULT_PORT: Int = 8080
  private final val CMD_SERVER: String = "server"

  def main(args: Array[String]) {
    // Expect the port to be passed in as the first arg
    val port:Int = args match {
      case Array() => DEFAULT_PORT
      case Array(num:String) => num.toInt
      case _ => throw new IllegalArgumentException
    }

    println(s"Starting server at `localhost:$port`")

    new ApiServer(port).run(CMD_SERVER)
  }
}
package sharkhacks5000.api

import java.util

import io.dropwizard.Application
import io.dropwizard.jetty.ConnectorFactory
import io.dropwizard.setup.{Bootstrap, Environment}
import sharkhacks5000.api.health.ApiHealth
import sharkhacks5000.api.resources.{IndexResource, StatusResource}
import io.dropwizard.assets.AssetsBundle

/**
 * Runner for the API server.
 */

class ApiServer extends Application[ApiConfiguration] {

  private final val API_HEALTH_CHECK: String = "api_health_check"
  private final val APPLICATION_CONTEXT_PATH: String = "api"

  override def initialize(bootstrap: Bootstrap[ApiConfiguration]) {
    bootstrap.addBundle(new AssetsBundle("/assets", "/assets"))
  }

  override def run(config: ApiConfiguration, environment: Environment): Unit = {
    // Change the routing so we can enable static files
    environment.getApplicationContext.setContextPath(APPLICATION_CONTEXT_PATH)
    environment.jersey().setUrlPattern(s"/$APPLICATION_CONTEXT_PATH/*");

    // Setup resources
    val indexResource: IndexResource = new IndexResource
    val statusResource: StatusResource = new StatusResource

    // Endpoints
    // /
    environment.jersey().register(indexResource)
    // /status
    environment.jersey().register(statusResource)

    // Health Check
    val apiHealth: ApiHealth = new ApiHealth
    environment.healthChecks().register(API_HEALTH_CHECK, apiHealth)
  }
}

/**
 * Starts the server at `localhost:PORT`
 */
object Main {
  private final val CMD_SERVER: String = "server"

  def main(args: Array[String]) {
    new ApiServer().run(CMD_SERVER)
  }
}
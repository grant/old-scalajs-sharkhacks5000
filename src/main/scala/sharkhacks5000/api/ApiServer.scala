package sharkhacks5000.api

import io.dropwizard.Application
import io.dropwizard.setup.Environment
import sharkhacks5000.api.health.ApiHealth
import sharkhacks5000.api.resources.IndexResource

/**
 * Runner for the API server.
 */
class ApiServer extends Application[ApiConfiguration] {

  private final val API_HEALTH_CHECK: String = "api_health_check"

  override def run(t: ApiConfiguration, environment: Environment): Unit = {
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
 * Starts the server at `localhost:8080`
 */
object Main {
  private final val CMD_SERVER: String = "server"

  def main(args: Array[String]) {
    new ApiServer().run(CMD_SERVER)
  }
}
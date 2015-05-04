package sharkhacks5000.api.resources

import javax.ws.rs.core.MediaType
import javax.ws.rs.{Path, GET, Produces}

/**
 * Returns "ok". Used to check the server status.
 */
@Path("/status")
class StatusResource {
  final val STATUS_OK = "ok\n"

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  def ok(): String = STATUS_OK
}

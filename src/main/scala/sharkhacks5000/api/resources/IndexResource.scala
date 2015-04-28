package sharkhacks5000.api.resources

import javax.ws.rs.{GET, Path, Produces}
import javax.ws.rs.core.MediaType

/**
 * The home page.
 */
@Path("/")
class IndexResource {
  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  def get(): String = {
    "index\n"
  }
}

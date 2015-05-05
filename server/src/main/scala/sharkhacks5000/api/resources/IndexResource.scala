package sharkhacks5000.api.resources

import javax.ws.rs.core.MediaType
import javax.ws.rs.{Path, GET, Produces}

/**
 * Returns "ok". Used to check the server status.
 */
@Path("/")
class IndexResource {

  //TODO Move this to a static file. I wasn't able to server static assets from root "/".
  @GET
  @Produces(Array(MediaType.TEXT_HTML))
  def index() = {
    """
      |<html>
      |<head>
      |  <title>SharkHacks5000</title>
      |</head>
      |<body onload="App().main();">
      |  Hello there!
      |  <div id="scripts"></div>
      |  <script src="//cdnjs.cloudflare.com/ajax/libs/react/0.12.1/react-with-addons.min.js"></script>
      |  <script src="http://localhost:8000/server/src/main/resources/generated/sharkhacks5000-client-fastopt.js"></script>
      |</body>
      |</html>
    """.stripMargin
//      <script src="/generated/sharkhacks5000-client-fastopt.js"></script>
  }
}

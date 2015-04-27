package sharkhacks5000.server

import com.twitter.finagle.http.Response
import com.twitter.finagle.{Http, Service}
import com.twitter.util.{Await, Future}
import org.jboss.netty.handler.codec.http._

import scala.util.Properties

/**
 * Server
 */
object Server {
  def main(args: Array[String]) {
    val port:Int = Properties.envOrElse("PORT", "8080").toInt
    println(s"Starting on port: $port")

    val server = Http.serve(s":$port", new SharkHacks5000Service)
    Await.ready(server)
  }
}

class SharkHacks5000Service extends Service[HttpRequest, HttpResponse] {
  override def apply(request: HttpRequest): Future[HttpResponse] = {
    showHome(request)
  }

  def showHome(request: HttpRequest): Future[HttpResponse] = {
    val response = Response()
    response.setStatusCode(200)
    response.setContentString("Hello SharkHacks5000!")
    Future(response)
  }
}

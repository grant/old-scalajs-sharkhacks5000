package main.scala.client

import japgolly.scalajs.react.React
import japgolly.scalajs.react.extra.router.BaseUrl
import main.scala.client.modules.MainRouter
import org.scalajs.dom

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

@JSExport("App")
object App extends JSApp {
  @JSExport
  def main(): Unit = {
    // build a baseUrl, this method works for both local and server addresses (assuming you use #)
    val baseUrl = BaseUrl(dom.window.location.href.takeWhile(_ != '#'))
    val router = MainRouter.router(baseUrl)

    // tell React to render the router in the document body
    React.render(router(), dom.document.body)
  }
}

package sharkhacks.client

import japgolly.scalajs.react.React
import japgolly.scalajs.react.extra.router.BaseUrl
import org.scalajs.dom
import sharkhacks.client.components.pages.PageStyles
import sharkhacks.client.components.sky.SkyStyles

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalacss.ScalaCssReact._
import scalacss.Defaults._
import japgolly.scalajs.react.React
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport


@JSExport("App")
object App extends JSApp {
  @JSExport
  def main(): Unit = {
    // build a baseUrl, this method works for both local and server addresses (assuming you use #)
    val baseUrl = BaseUrl(dom.window.location.href.takeWhile(_ != '#'))
    val router = MainRouter.router(baseUrl)

    // Load the css styles
    PageStyles.addToDocument()
//    SkyStyles.addToDocument()

    // tell React to render the router in the document body
    React.render(router(), dom.document.body)
  }
}

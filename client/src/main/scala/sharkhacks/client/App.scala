package sharkhacks.client

import japgolly.scalajs.react.React
import japgolly.scalajs.react.extra.router.BaseUrl
import org.scalajs.dom
import sharkhacks.client.components.OverlayStyles
import sharkhacks.client.components.bird.BirdStyles
import sharkhacks.client.components.boat.BoatStyles
import sharkhacks.client.components.cloud.CloudStyles
import sharkhacks.client.components.ocean.OceanStyles
import sharkhacks.client.components.outerspace.SunMoonStyles
import sharkhacks.client.components.pages.PageStyles
import sharkhacks.client.components.sky.SkyStyles

import scala.Array
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalacss.Defaults._
import scalacss.ScalaCssReact
import scalacss.ScalaCssReact._


@JSExport("App")
object App extends JSApp {
  @JSExport
  def main(): Unit = {
    // build a baseUrl, this method works for both local and server addresses (assuming you use #)
    val baseUrl = BaseUrl(dom.window.location.href.takeWhile(_ != '#'))
    val router = MainRouter.router(baseUrl)

    // Load the css styles
    Array.concat(
      // Single style sheets
      Array(
        ResetStyles,
        PageStyles,
        SkyStyles,
        OceanStyles,
        BoatStyles,
        CloudStyles,
        SunMoonStyles,
        OverlayStyles
      ),
      // Multiple styles
      BirdStyles.getStyles()
    ).foreach(_.addToDocument)

    // tell React to render the router in the document body
    React.render(router(), dom.document.body)
  }
}

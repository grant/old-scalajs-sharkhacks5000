package sharkhacks.client.components.pages

import java.awt.geom.Point2D

import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.ReactComponentB
import org.scalajs.dom.raw.UIEvent
import sharkhacks.client.{Viewport, MainRouter}
import sharkhacks.client.components.scene.Scene

import java.awt.Point
import org.scalajs.dom
import org.scalajs.jquery.jQuery

import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry

object HomePage {

  def setupGlobalEventListeners() {
    dom.window.onresize = (e: UIEvent) => {
      Viewport.width = dom.window.innerWidth
      Viewport.height = dom.window.innerHeight
    }
  }

  //  val Styles = GlobalRegistry[PageStyles].get
  val component = ReactComponentB[MainRouter.Router]("ExamplePage")
    .render(router => {
    setupGlobalEventListeners()
    //    div(Styles.page,
    //      Scene(Scene.Props())
    //    )
    Scene(Scene.Props())
  }).build
}

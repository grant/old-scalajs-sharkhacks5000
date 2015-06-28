package sharkhacks.client.components.pages

import java.awt.geom.Point2D

import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{TopNode, ReactComponentU, ReactComponentB}
import org.scalajs.dom.raw.UIEvent
import sharkhacks.client.components.scene.Scene.{Backend, State, Props}
import sharkhacks.client.{Viewport, MainRouter}
import sharkhacks.client.components.scene.Scene

import java.awt.Point
import org.scalajs.dom
import org.scalajs.jquery.jQuery

import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry

object HomePage {

  private val browserViewport = new Viewport


  def setupGlobalEventListeners() {
    // Window resize
    dom.window.onresize = (e: UIEvent) => {
      browserViewport.width = dom.window.innerWidth
      browserViewport.height = dom.window.innerHeight
    }

    // RAF
    def renderLoop(step: Double): Unit = {
      // Update the camera position
//      Scene.updateSceneDimensions(browserViewport.width, browserViewport.height)


      // Re-render
      dom.requestAnimationFrame(renderLoop _)
    }
    dom.requestAnimationFrame(renderLoop _)
  }

  val component = ReactComponentB[MainRouter.Router]("ExamplePage")
    .render(router => {
    setupGlobalEventListeners()

    div(
      Scene(Scene.Props())
    )
  }).build
}

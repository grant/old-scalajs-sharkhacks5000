package sharkhacks.client.components.pages

import java.awt.geom.Point2D

import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, TopNode, ReactComponentU, ReactComponentB}
import org.scalajs.dom.raw.UIEvent
import sharkhacks.Type.PointDouble
import sharkhacks.client.components.scene.Scene.{Backend, State, Props}
import sharkhacks.client.components.world.World.State
import sharkhacks.client.{Viewport, MainRouter}
import sharkhacks.client.components.scene.Scene
import sharkhacks.models.GameTime

import scala.collection.mutable.HashMap
import scala.scalajs.js

import org.scalajs.dom
import org.scalajs.jquery.jQuery
import scala.scalajs.js.Dynamic.{global => g}
import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry

/**
 * The root component for the page.
 */
object HomePage {

  val browserViewport = new Viewport

  private val keysDown = HashMap[Int, Boolean]()


  def updateBrowserViewport(): Unit = {
    browserViewport.width = dom.window.innerWidth
    browserViewport.height = dom.window.innerHeight

    // Make the camera dimensions the same as the browser dimensions for now.
    // Eventually we'll want to have the camera be able to zoom in and out
    Scene.camera.width = browserViewport.width
    Scene.camera.height = browserViewport.height
  }

  def setupGlobalEventListeners() {
    updateBrowserViewport

    // Window resize
    dom.window.onresize = (e: UIEvent) => {
      updateBrowserViewport
    }

    g.addEventListener("keydown", (e: dom.KeyboardEvent) => {
      keysDown += e.keyCode -> true

      // Move scene with arrow keys
      e.keyCode match {
        // left
        case 37 => Scene.camera.center = new PointDouble(Scene.camera.center.x - 10, Scene.camera.center.y)
        // up
        case 38 => Scene.camera.center = new PointDouble(Scene.camera.center.x, Scene.camera.center.y - 10)
        // right
        case 39 => Scene.camera.center = new PointDouble(Scene.camera.center.x + 10, Scene.camera.center.y)
        // down
        case 40 => Scene.camera.center = new PointDouble(Scene.camera.center.x, Scene.camera.center.y + 10)
          // other
        case _ => ;
      }
    }, false)

    g.addEventListener("keyup", (e: dom.KeyboardEvent) => {
      keysDown -= e.keyCode
    }, false)

    // RAF
    def renderLoop(step: Double): Unit = {
      // Re-render
      dom.requestAnimationFrame(renderLoop _)
    }
    dom.requestAnimationFrame(renderLoop _)
  }

  // Used by the router
  val component = ReactComponentB[MainRouter.Router]("ExamplePage")
    .render(router => {

    setupGlobalEventListeners()
    Scene.camera.center = new PointDouble(0, 0)

    Scene(Scene.Props())
  })
    .build
}

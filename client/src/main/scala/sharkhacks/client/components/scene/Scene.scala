package sharkhacks.client.components.scene

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra._
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.raw.HTMLElement
import sharkhacks.client.components.ocean.Ocean
import sharkhacks.client.components.pages.HomePage
import sharkhacks.client.components.seabed.Seabed
import sharkhacks.client.components.sky.Sky
import sharkhacks.models.GameTime

import scala.concurrent.duration._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}


import sharkhacks.Type.PointDouble
import sharkhacks.client.Camera
import sharkhacks.client.components.world.World
import sharkhacks.client.utils.CSSUtils

/**
 * The 2D world in which we live in. Contains the actual game elements. No UI.
 *
 * The way in which the world works is the following:
 * - The scene contains a world, which is a fixed (but large) width and height.
 * - The scene controls the camera, which manipulates the viewport of the world.
 *
 */
object Scene {

  var camera = new Camera

  case class Props()

  case class State(gameTime: GameTime)

  class Backend(t: BackendScope[Props, State]) extends OnUnmount {

    def tick(): Unit = {
      //      println("test")
      //      g.window.requestAnimationFrame(tick)
      t.setState(t.state.copy(gameTime = t.state.gameTime.tick()))
    }

    def componentDidMount() = {
      //      g.window.requestAnimationFrame
      tick()

      val i = js.timers.setInterval(16.millisecond)(tick())
      onUnmount(js.timers.clearInterval(i))
    }
  }

  val SceneComponent = ReactComponentB[Props]("SceneComponent")
    .initialStateP(props => {
      State(gameTime = new GameTime())
    })
    .backend(new Backend(_))
    .render((props, state, backend) => {

    // The scene moves the world according to the position of the camera
    val cameraTopLeft = camera.topLeft
    val styles: Array[TagMod] = Array(
      className := "Scene",
      transform := CSSUtils.translate(new PointDouble(-cameraTopLeft.x, -cameraTopLeft.y)),
      transformOrigin := "test"
    )

    div(styles,
      World(World.Props(state.gameTime))
    )
  })
    .componentDidMount(_.backend.componentDidMount())
    .build

  def apply(props: Props) = SceneComponent(props)
}


package sharkhacks.client.components.scene

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
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

  private var camera = new Camera

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  def updateSceneDimensions(width: Double, height: Double) {
    camera.width = width
    camera.height = height
  }

  val SceneComponent = ReactComponentB[Props]("SceneComponent")
    .initialState(State())
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
      World(World.Props())
    )
  })
    .build

  def apply(props: Props) = SceneComponent(props)
}


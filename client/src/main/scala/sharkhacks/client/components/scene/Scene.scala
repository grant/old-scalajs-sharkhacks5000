package sharkhacks.client.components.scene

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.components.world.World

/**
 * The 2D world in which we live in. Contains the actual game elements. No UI.
 *
 * The way in which the world works is the following:
 * - The scene contains a world, which is a fixed (but large) width and height.
 * - The scene controls the camera, which manipulates the viewport of the world.
 *
 */
object Scene {
  def update() = {
    println("update")
  }

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SceneComponent = ReactComponentB[Props]("SceneComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(className := "Scene",
      World(World.Props())
    )
  })
    .build

  def apply(props: Props) = SceneComponent(props)
}


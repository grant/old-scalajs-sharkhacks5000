package sharkhacks.client.components.scene

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.components.ocean.Ocean
import sharkhacks.client.components.seabed.Seabed
import sharkhacks.client.components.sky.Sky

object Scene {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SceneComponent = ReactComponentB[Props]("SceneComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(className := "Scene",
      Sky(Sky.Props()),
      Ocean(Ocean.Props()),
      Seabed(Seabed.Props())
    )
  })
    .build

  def apply(props: Props) = SceneComponent(props)
}


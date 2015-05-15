package sharkhacks.client.components.ocean

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._

object Ocean {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val OceanComponent = ReactComponentB[Props]("OceanComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(className := "Ocean"

    )
  })
    .build

  def apply(props: Props) = OceanComponent(props)
}


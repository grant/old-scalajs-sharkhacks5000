package sharkhacks.client.components.ocean

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.components.boat.Boat

import scalacss.ScalaCssReact._

object Ocean {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val OceanComponent = ReactComponentB[Props]("OceanComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(OceanStyles.ocean,
      Boat(Boat.Props())
    )
  })
    .build

  def apply(props: Props) = OceanComponent(props)
}


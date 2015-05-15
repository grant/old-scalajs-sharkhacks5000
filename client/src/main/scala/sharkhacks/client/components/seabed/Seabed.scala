package sharkhacks.client.components.seabed

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._

object Seabed {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SeabedComponent = ReactComponentB[Props]("SeabedComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(className := "Seabed"

    )
  })
    .build

  def apply(props: Props) = SeabedComponent(props)
}


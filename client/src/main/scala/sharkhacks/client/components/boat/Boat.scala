package sharkhacks.client.components.boat

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._

import scalacss.ScalaCssReact._

object Boat {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val BoatComponent = ReactComponentB[Props]("BoatComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(BoatStyles.boat

    )
  })
    .build

  def apply(props: Props) = BoatComponent(props)
}


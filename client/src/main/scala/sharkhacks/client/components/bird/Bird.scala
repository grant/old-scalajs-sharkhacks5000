package sharkhacks.client.components.bird

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._

import scalacss.ScalaCssReact._

object Bird {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val BirdComponent = ReactComponentB[Props]("BirdComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(BirdStyles.bird

    )
  })
    .build

  def apply(props: Props) = BirdComponent(props)
}


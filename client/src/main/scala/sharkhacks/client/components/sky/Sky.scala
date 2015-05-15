package sharkhacks.client.components.sky

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._

import scalacss.ScalaCssReact._

object Sky {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SkyComponent = ReactComponentB[Props]("SkyComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(
      SkyStyles.sky, "hin"
    )
  })
    .build

  def apply(props: Props) = SkyComponent(props)
}


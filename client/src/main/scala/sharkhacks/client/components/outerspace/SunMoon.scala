package sharkhacks.client.components.outerspace


import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._

import scalacss.ScalaCssReact._

object SunMoon {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SunMoonComponent = ReactComponentB[Props]("SunMoonComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(SunMoonStyles.sunmoon,
      "sun and moon"
    )
  })
    .build

  def apply(props: Props) = SunMoonComponent(props)
}

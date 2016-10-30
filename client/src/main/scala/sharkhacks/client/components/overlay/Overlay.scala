package sharkhacks.client.components.outerspace

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.components.OverlayStyles

import scalacss.ScalaCssReact._

object Overlay {

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val OverlayComponent = ReactComponentB[Props]("OverlayComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
      div(OverlayStyles.overlay,
        "overlay"
      )
    })
    .build

  def apply(props: Props) = OverlayComponent(props)
}

package sharkhacks.client.components.sky

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._

import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry

object Sky {

//  private val Styles = GlobalRegistry[SkyStyles].get

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SkyComponent = ReactComponentB[Props]("SkyComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(
    "skyyy"
//      Styles.sky, "hin"
//    SkyStyles.sky, "hin"
    )
  })
    .build

  def apply(props: Props) = SkyComponent(props)
}


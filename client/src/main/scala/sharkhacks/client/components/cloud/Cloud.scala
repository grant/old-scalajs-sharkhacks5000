package sharkhacks.client.components.cloud

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.Type
import Type._
import sharkhacks.client.utils.CSSUtils
import sharkhacks.models.geometry.Point

import scalacss.ScalaCssReact._

object Cloud {

  case class Props(val position: PointDouble)

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val CloudComponent = ReactComponentB[Props]("CloudComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(CloudStyles.cloud,
      transform := CSSUtils.translate(props.position),
      "testing"
    )
  })
    .build

  def apply(props: Props) = CloudComponent(props)
}


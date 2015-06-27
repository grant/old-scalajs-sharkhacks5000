package sharkhacks.client.components.cloud

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.Type._
import sharkhacks.client.utils.CSSUtils
import sharkhacks.models.geometry.Point

import scalacss.ScalaCssReact._

object Cloud {

  case class Props(val start: PointDouble)

  case class State(position: PointDouble)

  class Backend(t: BackendScope[Props, State]) {

  }

  val CloudComponent = ReactComponentB[Props]("CloudComponent")
    .initialStateP(props => {
      State(position = props.start)
    })
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(CloudStyles.cloud,
      transform := CSSUtils.translate(state.position),
      "testing"
    )
  })
    .build

  def apply(props: Props) = CloudComponent(props)
}


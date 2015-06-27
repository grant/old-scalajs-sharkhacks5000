package sharkhacks.client.components.ocean

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.Region
import sharkhacks.client.components.boat.Boat
import sharkhacks.client.utils.CSSUtils
import sharkhacks.models.geometry.Rectangle

import scalacss.ScalaCssReact._

object Ocean {

  case class Props(private val _region: Rectangle) extends Region {
    def region = _region
  }

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val OceanComponent = ReactComponentB[Props]("OceanComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {

    val styles: Array[TagMod] = props.getStyles ++
      Array[TagMod](OceanStyles.ocean)

    div(styles,
      Boat(Boat.Props())
    )
  })
    .build

  def apply(props: Props) = OceanComponent(props)
}


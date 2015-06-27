package sharkhacks.client.components.seabed


import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.Region
import sharkhacks.models.geometry.Rectangle

object Seabed {

  case class Props(private val _region: Rectangle) extends Region {
    def region = _region
  }

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SeabedComponent = ReactComponentB[Props]("SeabedComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {

    val styles: Array[TagMod] = props.getStyles ++ Array[TagMod](className := "Seabed")

    div(styles

    )
  })
    .build

  def apply(props: Props) = SeabedComponent(props)
}


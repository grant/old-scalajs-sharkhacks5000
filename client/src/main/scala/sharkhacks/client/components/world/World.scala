package sharkhacks.client.components.world

import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ReactComponentB}
import sharkhacks.client.components.ocean.Ocean
import sharkhacks.client.components.seabed.Seabed
import sharkhacks.client.components.sky.Sky
import sharkhacks.models.geometry.Rectangle

/**
 * The actual game world. This is a fixed size.
 */
object World {

  // In px
  private val WORLD_WIDTH = 1e4
  private val WORLD_HEIGHT = 1e7
  private val CENTER_X = WORLD_WIDTH / 2
  private val SEA_LEVEL_Y = WORLD_HEIGHT / 100
  // for now. Probably want to have an absolute height
  private val SEA_FLOOR_LEVEL_Y = WORLD_HEIGHT * (9.0 / 10.0)

  println(SEA_LEVEL_Y)
  println(SEA_FLOOR_LEVEL_Y)

  /**
   * # World Organization
   *
   * ## Vertical Layout
   *
   * --- 0
   * Space?
   * ---
   * Sky
   * ---
   * Sea level
   * ---
   * Epipelagic Zone (The Sunlight Zone)
   * ---
   * Mesopelagic Zone (The Twilight Zone)
   * ---
   * Bathypelagic Zone (The Midnight Zone)
   * ---
   * Abyssopelagic Zone (The Abyss)
   * ---
   * Hadalpelagic Zone (The Trenches)
   * ---
   * Sea floor
   * ---
   * Oceanic crust
   * ---
   * Lithosphere
   * ---
   * Earth mantle
   * --- WORLD_HEIGHT
   *
   *
   * ## Horizontal Layout
   *
   * - Same environment at same elevation
   * - Keep compass to center the player. Maybe use boats or the position of the sun too.
   *
   */

  case class Props()

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val WorldComponent = ReactComponentB[Props]("WorldComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {
    // TODO only render the parts of the world that are visible. Maybe tile the whole world?
    // (To determine which objects are in the viewport.)
    val skyRegion = new Rectangle(top = 0, bottom = SEA_LEVEL_Y, left = 0, right = WORLD_WIDTH)
    val oceanRegion = new Rectangle(top = SEA_LEVEL_Y, bottom = SEA_FLOOR_LEVEL_Y, left = 0, right = WORLD_WIDTH)
    val seabedRegion = new Rectangle(top = SEA_FLOOR_LEVEL_Y, bottom = WORLD_HEIGHT, left = 0, right = WORLD_WIDTH)

    val styles: Array[TagMod] = Array(
      className := "World",
      width := WORLD_WIDTH,
      height := WORLD_HEIGHT
    )

    // jsx
    div(styles,
      Sky(Sky.Props(_region = skyRegion)),
      Ocean(Ocean.Props(_region = oceanRegion)),
      Seabed(Seabed.Props(_region = seabedRegion))
    )
  })
    .build

  def apply(props: Props) = WorldComponent(props)
}


package sharkhacks.client.components.ocean

import sharkhacks.client.GlobalStyles.Color

import scalacss.Defaults._

object OceanStyles extends StyleSheet.Inline {

  import dsl._

  val ocean = style(
    position.absolute,
    width(100 %%),
    height(1600 px),
    backgroundColor(Color.Gray.Medium)
  )
}
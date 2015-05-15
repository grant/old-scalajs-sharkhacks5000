package sharkhacks.client.components.ocean

import sharkhacks.client.GlobalStyles.Colors

import scalacss.Defaults._

object OceanStyles extends StyleSheet.Inline {

  import dsl._

  val ocean = style(
    width(100 %%),
    height(1600 px),
    backgroundColor(Colors.Gray.Medium)
  )
}
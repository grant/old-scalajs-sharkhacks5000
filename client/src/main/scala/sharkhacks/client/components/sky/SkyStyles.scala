package sharkhacks.client.components.sky

import sharkhacks.client.GlobalStyles.Colors

import scalacss.Defaults._

object SkyStyles extends StyleSheet.Inline {

  import dsl._

  val sky = style(
    addClassName("sky"),
    width(100 %%),
    height(600 px),
    backgroundColor(Colors.Green.Medium)
  )
}
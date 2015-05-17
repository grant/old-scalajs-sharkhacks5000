package sharkhacks.client.components.sky

import sharkhacks.client.GlobalStyles.Color

import scalacss.Defaults._

object SkyStyles extends StyleSheet.Inline {

  import dsl._

  val sky = style(
    width(100 %%),
    height(600 px),
    backgroundColor(Color.Green.Medium)
  )
}
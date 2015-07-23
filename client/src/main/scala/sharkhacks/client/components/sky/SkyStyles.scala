package sharkhacks.client.components.sky

import sharkhacks.client.GlobalStyles.Color

import scalacss.Defaults._

object SkyStyles extends StyleSheet.Inline {

  import dsl._

  val sky = style(
    position.absolute,
    backgroundColor(Color.Green.Medium)
  )
}
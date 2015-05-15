package sharkhacks.client.components.pages

import scalacss.Defaults._
import scalacss._
import Dsl.{unsafeRoot => $, _}

object PageStyles extends StyleSheet.Inline {

  style(
    $("*")(
      boxSizing.borderBox
    ),

    $("html, body")(
      height(100 %%)
    ),

    $("em")(
      fontStyle.italic
    ),

    $("strong")(
      fontWeight._700
    ),

    $("button")(
      backgroundColor.transparent,
      border.`0`,
      outline.`0`
    )
  )
}

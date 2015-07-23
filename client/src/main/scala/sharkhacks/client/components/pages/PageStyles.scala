package sharkhacks.client.components.pages

import sharkhacks.client.GlobalStyles

import scalacss.Defaults._
import scalacss._
import Dsl.{unsafeRoot => $, _}

object PageStyles extends StyleSheet.Inline {

  style(
    $("*")(
      boxSizing.borderBox
    ),

    $("html")(
      overflow.hidden
    ),

    $("html, body")(
      height(100 %%),
      fontFamily := GlobalStyles.Fonts.Title.Family
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

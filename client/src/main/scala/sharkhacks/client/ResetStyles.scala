package sharkhacks.client

import scalacss.Defaults._
import scalacss._
import Dsl.{unsafeRoot => $, _}

object ResetStyles extends StyleSheet.Inline {

  /**
   * Eric Meyer’s “Reset CSS” 2.0
   * http://meyerweb.com/eric/tools/css/reset/
   * License: none (public domain)
   */
  val resetcss = style(
    $( """
         |html, body, div, span, applet, object, iframe,
         |h1, h2, h3, h4, h5, h6, p, blockquote, pre,
         |a, abbr, acronym, address, big, cite, code,
         |del, dfn, em, img, ins, kbd, q, s, samp,
         |small, strike, strong, sub, sup, tt, var,
         |b, u, i, center,
         |dl, dt, dd, ol, ul, li,
         |fieldset, form, label, legend,
         |table, caption, tbody, tfoot, thead, tr, th, td,
         |article, aside, canvas, details, embed,
         |figure, figcaption, footer, header, hgroup,
         |menu, nav, output, ruby, section, summary,
         |time, mark, audio, video
       """.stripMargin.replaceAll("\\s+", ""))(
        margin.`0`,
        padding.`0`,
        border.`0`,
        fontSize(100 %%),
        font := Literal.inherit,
        verticalAlign.baseline
      ),

    $("article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section")(
      display.block
    ),

    $("body")(
      lineHeight(1)
    ),

    $("ol,ul")(
      listStyle := none
    ),

    $("blockquote, q")(
      quotes.none
    ),

    $("blockquote:before, blockquote:after, q:before, q:after")(
      content := "''",
      content := none
    ),

    $("table")(
      borderCollapse.collapse,
      borderSpacing.`0`
    )
  )
}

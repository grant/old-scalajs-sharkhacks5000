package sharkhacks.client.components.pages

import scalacss.Defaults._

object PageStyles extends StyleSheet.Inline {
  import dsl._

  style(unsafeRoot("body")(
    paddingTop(50.px))
  )

  style(unsafeRoot(".label-as-badge")(
    borderRadius(1.em))
  )
}

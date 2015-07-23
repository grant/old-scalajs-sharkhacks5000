package sharkhacks.client

import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.utils.CSSUtils
import sharkhacks.models.geometry.Rectangle

/**
 * Created by timmerman on 6/27/15.
 */
trait Region {
  def region: Rectangle

  def getStyles: Array[TagMod] = {
    Array(
      top := CSSUtils.px(region.top),
      left := CSSUtils.px(region.left),
      width := CSSUtils.px(region.width),
      height := CSSUtils.px(region.height)
    )
  }
}

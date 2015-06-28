package sharkhacks.client

import sharkhacks.Type._
import sharkhacks.models.geometry.Rectangle

/**
 * A rectangle frame area.
 * Created by timmerman on 6/27/15.
 */
class Viewport {
  private val frame: Rectangle = new Rectangle(_center = new PointDouble, _width = 400, _height = 300)

  def center: PointDouble = frame.center

  def center_=(c: PointDouble): Unit = {
    frame.center = c
  }

  def width = frame.width

  def width_=(w: Double): Unit = {
    frame.width = w
  }

  def height: Double = frame.height

  def height_=(h: Double): Unit = {
    frame.height = h
  }

  def left: Double = frame.left

  def top: Double = frame.top

  def bottom: Double = frame.bottom

  def right: Double = frame.right

  def topLeft: PointDouble = frame.topLeft

  def bottomRight: PointDouble = frame.bottomRight

}

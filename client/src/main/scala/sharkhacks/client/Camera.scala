package sharkhacks.client

import sharkhacks.Type.PointDouble

/**
 * A scene camera
 * Created by timmerman on 6/27/15.
 */
class Camera {
  private val viewport = new Viewport

  def center: PointDouble = viewport.center

  def center_=(c: PointDouble): Unit = {
    viewport.center = c
  }

  def width = viewport.width

  def width_=(w: Double): Unit = {
    viewport.width = w
  }

  def height = viewport.height

  def height_=(h: Double): Unit = {
    viewport.height = h
  }

  def topLeft: PointDouble = viewport.topLeft
}

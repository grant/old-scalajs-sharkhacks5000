package sharkhacks.client

import sharkhacks.Type._

/**
 * Created by timmerman on 6/27/15.
 */
class Viewport {
  // Private
  private var _width: Double = 0
  private var _height: Double = 0
  private var _center: PointDouble = new PointDouble

  // Public
  def width = _width

  def width_=(w: Double) = {
    assert(w >= 0)
    _width = w
  }

  def height = _height

  def height_=(h: Double) = {
    assert(h >= 0)
    _height = h
  }

  def center = _center

  def center_=(c: PointDouble) = {
    _center = c
  }
}

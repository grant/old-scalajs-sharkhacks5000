package sharkhacks.models

/**
 * sharkhacks.models
 */
class GameTime(val time:Int = 0) {
  def tick(): GameTime = new GameTime(time + 1)
}

package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Point")
@js.native
class Point(var x: Double, var y: Double) extends js.Object {
  def copy(p: Point): Unit = js.native
  override def clone(): Point = js.native
  def equals(p: Point): Boolean = js.native
  def set(x: Double): Unit = js.native
  def set(x: Double, y: Double): Unit = js.native
}

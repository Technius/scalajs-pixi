package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSImport("pixi.js" , "DisplayObject")
@js.native
abstract class DisplayObject extends Pixi.utils.EventEmitter
    with interaction.InteractiveTarget {

  var alpha: Double = js.native
  var cacheAsBitmap: Boolean = js.native

  def parent: Container = js.native

  var pivot: Point = js.native
  var position: Point = js.native
  var renderable: Boolean = js.native
  var rotation: Double = js.native
  var scale: Point = js.native
  var visible: Boolean = js.native

  var x: Double = js.native
  var y: Double = js.native

  def destroy(): Unit = js.native

  def setParent(container: Container): Container = js.native

  def toGlobal(position: Point): Point = js.native

  def toLocal(position: Point, from: Point): Point = js.native
}

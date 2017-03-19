package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Container")
@js.native
class Container extends DisplayObject {
  var width: Double = js.native
  var height: Double = js.native

  val children: js.Array[DisplayObject] = js.native

  def addChild(child: DisplayObject): DisplayObject = js.native
  def addChildAt(child: DisplayObject, index: Int): DisplayObject = js.native

  def destroy(destroyChildren: Boolean): Unit = js.native

  def removeChild(child: DisplayObject): DisplayObject = js.native
  def removeChildAt(child: DisplayObject, index: Int): DisplayObject = js.native

  def removeChildren(beginIndex: Int, endIndex: Int): Unit = js.native
}

package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom.html

@JSName("PIXI.SystemRenderer")
@js.native
class SystemRenderer(
    system: String,
    width: Int,
    height: Int,
    options: js.Object) extends Pixi.utils.EventEmitter {

  var autoResize: Boolean = js.native
  var backgroundColor: Int = js.native
  var clearBeforeRender: Boolean = js.native

  def width: Int = js.native
  def height: Int = js.native

  def view: html.Canvas = js.native

  def resize(width: Int, height: Int): Unit = js.native
  def render(`object`: DisplayObject): Unit = js.native
}

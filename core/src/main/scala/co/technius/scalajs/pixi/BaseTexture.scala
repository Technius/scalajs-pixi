package co.technius.scalajs.pixi

import org.scalajs.dom.html.{ Image, Canvas }
import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation._

@JSName("PIXI.BaseTexture")
@js.native
class BaseTexture(
    val source: Image | Canvas,
    var scaleMode: Int = ???,
    var resolution: Double) extends Pixi.utils.EventEmitter {

  var imageUrl: String = js.native

  var mipmap: Boolean = js.native
  var premultipliedAlpha: Boolean = js.native

  def height: Int = js.native
  def width: Int = js.native
  def realHeight: Int = js.native
  def realWidth: Int = js.native

  def isLoading: Boolean = js.native
  def hasLoaded: Boolean = js.native

  def destroy(): Unit = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
  def updateSourceImage(newSrc: String): Unit = js.native
}

@js.native
trait BaseTextureStatic extends js.Object {
  def fromCanvas(canvas: Canvas, scaleMode: Int): BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean = ???, scaleMode: Int = ???): BaseTexture = js.native
}

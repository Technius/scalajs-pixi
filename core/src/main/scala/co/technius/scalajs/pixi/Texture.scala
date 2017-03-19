package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Texture")
@js.native
class Texture(baseTexture: BaseTexture) extends js.Object {
  var height: Int = js.native
  val valid: Boolean = js.native
  var width: Int = js.native

  override def clone(): Texture = js.native

  def destroy(): Unit = js.native
  def destroy(destroyBase: Boolean): Unit = js.native
}

@js.native
trait TextureStatic extends js.Object {
  def fromImage(imageUrl: String): Texture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean, scaleMode: Int): Texture = js.native
}

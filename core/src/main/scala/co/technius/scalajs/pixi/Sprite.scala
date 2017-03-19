package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Sprite")
@js.native
class Sprite(val texture: Texture) extends Container {
  var anchor: Point = js.native

  def worldAlpha: Double = js.native
  def worldVisible: Boolean = js.native
}

@js.native
trait SpriteStatic extends js.Object {
  def fromImage(imageId: String): Sprite = js.native
}

@JSImport("pixi.js", "Sprite") @js.native object Sprite extends SpriteStatic

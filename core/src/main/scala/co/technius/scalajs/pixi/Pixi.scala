package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSName("PIXI")
@js.native
object Pixi extends js.Object {
  def autoDetectRenderer(width: Int, height: Int): SystemRenderer = js.native
  def autoDetectRenderer(width: Int, height: Int, options: js.Object): SystemRenderer = js.native

  val BaseTexture: BaseTextureStatic = js.native
  val Texture: TextureStatic = js.native
  val Sprite: SpriteStatic = js.native

  @JSName("SCALE_MODES")
  @js.native
  object ScaleModes extends js.Object {
    @JSName("DEFAULT") val Default: Int = js.native
    @JSName("LINEAR")  val Linear:  Int = js.native
    @JSName("NEAREST") val Nearest: Int = js.native
  }
}

package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSImport("pixi.js", JSImport.Namespace)
@js.native
object Pixi extends js.Object {
  def autoDetectRenderer(width: Int, height: Int): SystemRenderer = js.native
  def autoDetectRenderer(width: Int, height: Int, options: js.Object): SystemRenderer = js.native

  val loader: loaders.Loader = js.native

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

  @JSName("TEXT_GRADIENT")
  @js.native
  object TextGradient extends js.Object {
    @JSName("LINEAR_VERTICAL") val LinearVertical: Double = js.native
    @JSName("LINEAR_HORIZONTAL") val LinearHorizontal: Double = js.native
  }

  @js.native
  object utils extends js.Object {
    @js.native
    class EventEmitter extends js.Object {
      def listeners(event: String): js.Array[js.Function] = js.native
      def emit(event: String, args: js.Any*): Boolean = js.native
      def on(event: String, fn: js.Function): this.type = js.native
      def once(event: String, fn: js.Function): this.type = js.native
      def removeListener(event: String, fn: js.Function): this.type = js.native
      def removeAllListeners(event: String): this.type = js.native

      def off(event: String, fn: js.Function): this.type = js.native
      def addListener(event: String, fn: js.Function): this.type = js.native
    }
  }
}

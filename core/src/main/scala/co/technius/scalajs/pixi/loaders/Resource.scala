package co.technius.scalajs.pixi.loaders

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation._

import co.technius.scalajs.pixi

@JSName("PIXI.loaders.Resource")
@js.native
class Resource extends pixi.Pixi.utils.EventEmitter {
  val name: String = js.native
  val texture: js.UndefOr[pixi.Texture] = js.native
  val textures: js.Array[pixi.Texture] = js.native
  val url: String = js.native
  val data: js.Any = js.native
  val crossOrigin: Boolean | String = js.native
  val loadType: Int = js.native
  val xhrType: String = js.native
  val error: js.Error = js.native
  val xhr: dom.XMLHttpRequest = js.native
  val SVGMetadataElement: js.Any = js.native

  def complete(): Unit = js.native

  def load(): Unit = js.native
  def load(cb: js.Function0[_]): Unit = js.native
}

@JSName("PIXI.loaders.Resource")
@js.native
object Resource extends js.Object{

  @JSName("LOAD_TYPE")
  @js.native
  object LoadType extends js.Object{
    @JSName("XHR")   val Xhr:   Int = js.native
    @JSName("IMAGE") val Image: Int = js.native
    @JSName("AUDIO") val Audio: Int = js.native
    @JSName("VIDEO") val Video: Int = js.native
  }
}

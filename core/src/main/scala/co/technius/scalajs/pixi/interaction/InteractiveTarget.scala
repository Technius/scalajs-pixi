package co.technius.scalajs.pixi.interaction

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSName("PIXI.interaction.InteractiveTarget")
@js.native
trait InteractiveTarget extends js.Object {
  var interactive: Boolean = js.native
  var buttonMode: Boolean = js.native
  var interactiveChildren: Boolean = js.native
  var defaultCursor: String = js.native
  var hitArea: js.Object = js.native // TODO: Create real facade for this
}

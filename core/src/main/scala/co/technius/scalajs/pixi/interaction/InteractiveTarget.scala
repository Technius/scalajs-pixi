package co.technius.scalajs.pixi.interaction

import scala.scalajs.js

@js.native
trait InteractiveTarget extends js.Object {
  var interactive: Boolean = js.native
  var buttonMode: Boolean = js.native
  var interactiveChildren: Boolean = js.native
  var defaultCursor: String = js.native
  var hitArea: js.Object = js.native // TODO: Create real facade for this
}

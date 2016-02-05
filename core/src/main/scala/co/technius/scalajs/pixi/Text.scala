package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation._

@JSName("PIXI.Text")
@js.native
class Text(var text: String, var style: TextStyle) extends Sprite(???)

@JSExportAll
class TextStyle(
  var font: String | js.UndefOr[Nothing] = js.undefined,
  var fill: String | Int | js.UndefOr[Nothing] = js.undefined,
  var align: String | js.UndefOr[Nothing] = js.undefined,
  var stroke: String | Int | js.UndefOr[Nothing] = js.undefined,
  var strokeThickness: Int | js.UndefOr[Nothing] = js.undefined,
  var wordWrap: Boolean | js.UndefOr[Nothing] = js.undefined,
  var wordWrapWidth: Int | js.UndefOr[Nothing] = js.undefined,
  var dropShadow: Boolean | js.UndefOr[Nothing] = js.undefined,
  var dropShadowColor: String | js.UndefOr[Nothing] = js.undefined,
  var dropShadowAngle: Double | js.UndefOr[Nothing] = js.undefined,
  var dropShadowDistance: Int | js.UndefOr[Nothing] = js.undefined)

package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Text")
@js.native
class Text(var text: String, var style: TextStyle) extends Sprite(???)

// JSImport with js.native doesn't work
@ScalaJSDefined
class TextStyle(
  var align: String = "left",
  var breakWords: Boolean = false,
  var dropShadow: Boolean = false,
  var dropShadowAlpha: Double = 1.0,
  var dropShadowAngle: Double = math.Pi / 6,
  var dropShadowBlur: Double = 0,
  var dropShadowColor: String = "#000000",
  var dropShadowDistance: Int = 5,
  var fill: String | js.Array[String] | Int = "black",
  var fillGradientType: Number = Pixi.TextGradient.LinearHorizontal,
  var fillGradientStops: js.Array[Double] = js.Array(),
  var fontFamily: String | js.Array[String] = "Arial",
  var fontSize: Int | String = 26,
  var fontStyle: String = "normal",
  var fontVariant: String = "normal",
  var fontWeight: String = "normal",
  var letterSpacing: Double = 0,
  var lineHeight: js.UndefOr[Double] = js.undefined,
  var miterLimit: Double = 10,
  var padding: Double = 0,
  var stroke: String | Int = "black",
  var strokeThickness: Int = 0,
  var trim: Boolean = false,
  var textBaseline: String = "alphabetic",
  var wordWrap: Boolean = false,
  var wordWrapWidth: Int = 100
) extends js.Object

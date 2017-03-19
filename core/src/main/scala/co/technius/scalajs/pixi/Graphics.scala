package co.technius.scalajs.pixi

import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Graphics")
@js.native
class Graphics extends Container {
  def beginFill(color: Double, alpha: Double): Graphics = js.native
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  def drawEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  def endFill(): Graphics = js.native
  def generateTexture(resolution: Int, scaleMode: Int): Texture = js.native
  def lineStyle(lineWidth: Double, color: Double, alpha: Double): Graphics = js.native
  def lineTo(x: Double, y: Double): Graphics = js.native
  def moveTo(x: Double, y: Double): Graphics = js.native
  def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): Graphics = js.native
}

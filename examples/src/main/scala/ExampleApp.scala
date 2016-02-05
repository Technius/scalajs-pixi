import scala.scalajs.js
import org.scalajs.dom
import org.scalajs.dom.html

import co.technius.scalajs.pixi

object ExampleApp extends js.JSApp {

  def main(): Unit = {
    val renderer = pixi.Pixi.autoDetectRenderer(600, 600)
    dom.document.body.appendChild(renderer.view)

    val root = new pixi.Container
    val shapeTexture =
      new pixi.Graphics()
        .beginFill(0xFFAA00, 1)
        .drawRect(0, 0, 50, 50)
        .endFill()
        .generateTexture(1, pixi.Pixi.ScaleModes.Nearest)

    val minX, minY = 75
    val maxX, maxY = 525
    
    val shapeNW = initBoxAndAdd(shapeTexture, minX, minY, root)
    val shapeNE = initBoxAndAdd(shapeTexture, maxX, minY, root)
    val shapeSW = initBoxAndAdd(shapeTexture, minX, maxY, root)
    val shapeSE = initBoxAndAdd(shapeTexture, maxX, maxY, root)

    val text = new pixi.Text("scalajs-pixi", new pixi.TextStyle(fill = "white"))
    text.scale.set(1.75)
    text.position.x = (renderer.width - text.width) / 2
    text.position.y = (renderer.height - text.height) / 2

    root.addChild(text)

    lazy val renderFn: (Double) => Unit = { totalTime =>
      val moveBy = 425 * (1 + math.sin(totalTime / 700.0)) / 2
      shapeNW.x = minX + moveBy
      shapeSE.x = maxX - moveBy
      shapeNE.y = minY + moveBy
      shapeSW.y = maxY - moveBy
      renderer.render(root)
      dom.window.requestAnimationFrame(renderFn)
    }

    renderFn(0)
  }

  def createBox(texture: pixi.Texture): pixi.Sprite = {
    val shape = new pixi.Sprite(texture)
    shape.width = 50
    shape.height = 50
    shape.pivot.set(25, 25)
    shape
  }

  def initBoxAndAdd(texture: pixi.Texture, x: Int, y: Int, root: pixi.Container): pixi.Sprite = {
    val s = createBox(texture)
    s.position.set(x, y)
    root.addChild(s)
    s
  }
}

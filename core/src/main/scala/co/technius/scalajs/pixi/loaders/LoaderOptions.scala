package co.technius.scalajs.pixi.loaders

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation._

@js.native
trait LoaderOptions extends js.Object {
  val crossOrigin: js.UndefOr[Boolean | String]
  val loadType: js.UndefOr[Int]
  val xhrType: js.UndefOr[String]
  val metaData: js.UndefOr[js.Any]
}

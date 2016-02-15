package co.technius.scalajs.pixi.loaders

import scala.scalajs.js
import scala.scalajs.js.annotation._

import co.technius.scalajs.pixi.Pixi

@JSName("PIXI.loaders.Loader")
@js.native
class Loader(_baseUrl: js.UndefOr[String] = ???, concurrency: js.UndefOr[Int] = ???)
    extends Pixi.utils.EventEmitter {

  val baseUrl: String = js.native
  val progress: Double = js.native
  val loading: Boolean = js.native
  val resources: ResourceDictionary = js.native

  // TODO: More thorough facade
  def add(name: String, url: String): Loader = js.native

  def before(fn: js.Function): Loader = js.native
  def pre(fn: js.Function): Loader = js.native

  def after(fn: js.Function): Loader = js.native
  def use(fn: js.Function): Loader = js.native

  def reset(): Unit = js.native

  def load(): Loader = js.native
  def load(cb: js.Function2[Loader, ResourceDictionary, Unit]): Loader = js.native
}

object LoaderDSL {

  sealed trait LoadEvent[FnType <: js.Function] {
    def ev: String
  }

  object LoadEvent {

    case object Complete extends LoadEvent[js.Function2[Loader, js.Any, Unit]] {
      val ev = "complete"
    }

    case object Error extends LoadEvent[js.Function3[js.Error, Loader, Resource, Unit]] {
      val ev = "error"
    }

    case object Load extends LoadEvent[js.Function2[Loader, Resource, Unit]] {
      val ev = "load"
    }

    case object Progress extends LoadEvent[js.Function2[Loader, Resource, Unit]] {
      val ev = "progress"
    }

    case object Start extends LoadEvent[js.Function1[Loader, Unit]] {
      val ev = "start"
    }

  }

  implicit class LoaderOps(val loader: Loader) extends AnyVal {
    @inline def on[T <: js.Function](event: LoadEvent[T])(fn: T): Loader =
      loader.on(event.ev, fn)
    
    @inline def once[T <: js.Function](event: LoadEvent[T])(fn: T): Loader =
      loader.once(event.ev, fn)
  }
}

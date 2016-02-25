package co.technius.scalajs.pixi.loaders

import scala.scalajs.js
import scala.scalajs.js.annotation._

import co.technius.scalajs.pixi.Pixi

@JSName("PIXI.loaders.Loader")
@js.native
class Loader extends Pixi.utils.EventEmitter {

  def this(baseUrl: String) = this()
  def this(concurrency: Int) = this()
  def this(baseUrl: String, concurrency: Int) = this()

  val baseUrl: String = js.native
  val progress: Double = js.native
  val loading: Boolean = js.native
  val resources: ResourceDictionary = js.native

  // Ugly mess because can't do overloading with default args
  def add(name: String, url: String): Loader = js.native
  def add(name: String, url: String, options: LoaderOptions): Loader = js.native
  def add(name: String, url: String, cb: js.Function0[_]): Loader = js.native
  def add(name: String, url: String, options: LoaderOptions, cb: js.Function0[_]): Loader = js.native
  def add(url: String): Loader = js.native
  def add(url: String, options: LoaderOptions): Loader = js.native
  def add(url: String, cb: js.Function0[_]): Loader = js.native
  def add(url: String, options: LoaderOptions, cb: js.Function0[_]): Loader = js.native

  def before(fn: js.Function): Loader = js.native
  def pre(fn: js.Function): Loader = js.native

  def after(fn: js.Function): Loader = js.native
  def use(fn: js.Function): Loader = js.native

  def reset(): Unit = js.native

  def load(): Loader = js.native
  def load(cb: js.Function2[Loader, ResourceDictionary, _]): Loader = js.native
}

object LoaderDSL {

  sealed trait LoadEvent[FnType <: js.Function] {
    def ev: String
  }

  object LoadEvent {

    case object Complete extends LoadEvent[js.Function2[Loader, js.Any, _]] {
      val ev = "complete"
    }

    case object Error extends LoadEvent[js.Function3[js.Error, Loader, Resource, _]] {
      val ev = "error"
    }

    case object Load extends LoadEvent[js.Function2[Loader, Resource, _]] {
      val ev = "load"
    }

    case object Progress extends LoadEvent[js.Function2[Loader, Resource, _]] {
      val ev = "progress"
    }

    case object Start extends LoadEvent[js.Function1[Loader, _]] {
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

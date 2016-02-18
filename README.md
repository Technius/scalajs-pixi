# Scala.js facades for Pixi.js

This is an experimental library that provides facades for
[Pixi.js](http://pixijs.com/). It is untested and
incomplete (and will probably stay that way for a while), so it's
highly likely that it currently doesn't work. Feel free to try it out, though.

You can find some examples in the
[examples folder](https://github.com/Technius/scalajs-pixi/tree/master/examples).

## Usage

Add the following lines to your `build.sbt`:

```scala
resolvers += "Artifactory" at "https://oss.jfrog.org/artifactory/oss-snapshot-local/",
libraryDependencies += "co.technius.scalajs-pixi" %%% "core" % "0.0.1-SNAPSHOT"
```

Import the relevant classes:
```scala
import co.technius.scalajs.pixi // The equivalent of PIXI.* classes
import co.technius.scalajs.pixi.Pixi // Contains the PIXI.* vars/functions
import co.technius.scalajs.pixi.loaders.LoaderDSL._ // Type-safe load events
```

## License
This library is licensed under the MIT License. See LICENSE for more details.

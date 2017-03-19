# Scala.js facades for Pixi.js

This is an experimental library that provides facades for
[Pixi.js](http://pixijs.com/). It is untested and
incomplete (and will probably stay that way for a while), so it's
highly likely that it currently doesn't work. Feel free to try it out, though.

You can find some examples in the
[examples folder](https://github.com/Technius/scalajs-pixi/tree/master/examples).

## Usage

### Build definition
Add the following lines to your `build.sbt`:

```scala
resolvers += "Artifactory" at "https://oss.jfrog.org/artifactory/oss-snapshot-local/",
libraryDependencies += "co.technius.scalajs-pixi" %%% "core" % "0.0.1-SNAPSHOT"
```

This library uses `@JSImport` in its facades, so your applications will need to
export CommonJS modules.

### Scala.js Bundler

One way to handle the JavaScript packaging is to use the
[scala.js bundler plugin](https://scalacenter.github.io/scalajs-bundler/). Add
the following line to `project/plugins.sbt`:
```scala
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.5.0")
```

Then, add the following lines to `build.sbt`:
```scala
npmDependencies in Compile += "pixi.js" -> "3.0.7",
npmDevDependencies in Compile += "json-loader" -> "*",
webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")
```
This will package Pixi along with your application. The other lines help work
around the way Pixi is built. Accordingly, you'll also need to create a
`webpack.config.js` that correctly builds Pixi:
```javascript
var webpack = require("webpack");
var config = require("./scalajs.webpack.config");
config.module.loaders = [
    {
        test: /\.json$/,
        loader: "json-loader"
    }
];
config.node = (config.node || {});
config.node.fs = "empty";
module.exports = config;
```

### Using the library

Import the relevant classes:
```scala
import co.technius.scalajs.pixi // The equivalent of PIXI.* classes
import co.technius.scalajs.pixi.Pixi // Contains the PIXI.* vars/functions
import co.technius.scalajs.pixi.loaders.LoaderDSL._ // Type-safe load events
```

Then use the library as you would Pixi, noting the difference in package names.
See [the example](examples/src/main) and the [build file](build.sbt) for
sample code and build definitions.

## License
This library is licensed under the MIT License. See LICENSE for more details.

lazy val sharedSettings = Seq(
  version := "0.0.1-SNAPSHOT",
  organization := "co.technius.scalajs-pixi",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-Xlint",
    "-Xfatal-warnings"
  )
)

lazy val root = (project in file(".")).aggregate(core, examples)

lazy val core =
  Project("core", file("core"))
    .settings(sharedSettings: _*)
    .settings(Publish.settings: _*)
    .settings(
      name := """core""",
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.9.1",
        "org.scalatest" %% "scalatest" % "3.0.1" % "test"
      )
    )
    .enablePlugins(ScalaJSPlugin)

lazy val examples =
  Project("examples", file("examples"))
    .settings(sharedSettings: _*)
    .settings(
      name := """examples""",
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.9.1"
      ),
      npmDependencies in Compile += "pixi.js" -> "3.0.7",
      npmDevDependencies in Compile += "json-loader" -> "*",
      webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")
    )
    .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
    .dependsOn(core)

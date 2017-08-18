lazy val root = (project in file("."))
  .settings(
    inThisBuild(Seq(
      version := "0.0.1-SNAPSHOT",
      organization := "co.technius.scalajs-pixi",
      crossScalaVersions := Seq("2.12.3", "2.11.8"),
      scalaVersion := crossScalaVersions.value.head,
      scalacOptions ++= Seq(
        "-feature",
        "-deprecation",
        "-Xlint",
        "-Xfatal-warnings"
      )
    ))
  )
  .aggregate(core, examples)

lazy val core =
  Project("core", file("core"))
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
    .settings(
      name := """examples""",
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.9.1"
      ),
      npmDependencies in Compile += "pixi.js" -> "4.2.2",
      npmDevDependencies in Compile += "json-loader" -> "*",
      scalaJSUseMainModuleInitializer := true,
      webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")
    )
    .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
    .dependsOn(core)

lazy val sharedSettings = Seq(
  version := "0.0.1-SNAPSHOT",
  organization := "co.technius.scalajs-pixi",
  scalaVersion := "2.11.7",
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
        "org.scala-js" %%% "scalajs-dom" % "0.8.0",
        "org.scalatest" %% "scalatest" % "2.2.4" % "test"
      )
    )
    .enablePlugins(ScalaJSPlugin)

lazy val examples =
  Project("examples", file("examples"))
    .settings(sharedSettings: _*)
    .settings(
      name := """examples""",
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.8.0"
      ),
      jsDependencies += "org.webjars" % "pixi.js" % "3.0.7" / "pixi.js"
    )
    .enablePlugins(ScalaJSPlugin)
    .dependsOn(core)

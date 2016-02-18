import sbt._
import Keys._

object Publish {
  lazy val settings = Seq(
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false },
    publishTo := {
      val ossJfrog = "https://oss.jfrog.org/artifactory/"
      if (isSnapshot.value)
        Some("Artifactory Realm" at ossJfrog + "oss-snapshot-local;build.timestamp=" + new java.util.Date().getTime) 
      else
        Some("Artifactory Realm" at ossJfrog + "oss-release-local")
    },
    pomExtra := (
      <url>http://github.com/Technius/scalajs-pixi</url>
      <licenses>
        <license>
          <name>MIT License</name>
          <url>https://opensource.org/licenses/MIT</url>
          <distribution>repo</distribution>
        </license>
      </licenses>
      <scm>
        <url>git@github.com:Technius/scalajs-pixi.git</url>
        <connection>scm:git:git@github.com:Technius/scalajs-pixi.git</connection>
      </scm>
      <developers>
        <developer>
          <id>technius</id>
          <name>Bryan Tan</name>
          <url>http://technius.co</url>
        </developer>
      </developers>)
    )
}

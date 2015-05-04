import com.typesafe.sbt.SbtNativePackager
import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
import com.typesafe.sbt.packager.universal.UniversalKeys
import play._
import sbt._
import sbt.Keys._

object Build extends Build with UniversalKeys {

  val appName = "sharkhacks5000"

  /**
   * Define the root project as an aggregation of the subprojects.
   */

  lazy val root =
    project.in(file("."))
      .settings(commonSettings:_*)
      .aggregate(server)

  /**
   * Define the server project as a Play application.
   */
  lazy val server =
    project.in(file("server"))
      .settings(serverSettings:_*)
      .enablePlugins(SbtNativePackager)
//      .enablePlugins(JavaAppPackaging)
  //      .enablePlugins(PlayScala)

  /**
   * The settings for the server module
   */
  lazy val serverSettings = commonSettings ++ Seq(
    name := s"$appName-server",
    libraryDependencies ++= Dependencies.serverDeps
  )

  /**
   * The setting that will be applied to all sub projects
   */
  lazy val commonSettings = Seq(
    organization := "com.sharkhacks5000",
    version := "1.0-SNAPSHOT",
    name := "sharkhacks5000",
    scalaVersion := "2.11.4"
  )

  /**
   * A simple container object for the dependencies.
   */
  object Dependencies {

    lazy val serverDeps = Seq(
      "io.dropwizard" % "dropwizard-core" % "0.8.1",
      "io.dropwizard" % "dropwizard-assets" % "0.8.1"
    )
  }
}
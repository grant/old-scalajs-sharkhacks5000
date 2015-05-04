//import com.typesafe.sbt.SbtNativePackager
//import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
import sbt._
import sbt.Keys._

object Build extends Build {

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
//      .enablePlugins(SbtNativePackager)
//      .enablePlugins(JavaAppPackaging)
  //      .enablePlugins(PlayScala)

  /**
   * The settings for the server module
   */
  lazy val serverSettings = commonSettings ++ Seq(
    name := s"$appName-server",
    libraryDependencies ++= Dependencies.serverDeps
  )

  lazy val stage: TaskKey[Unit] = TaskKey[Unit]("stage", "Prepares the project for production.")
  lazy val stageTask = {
    println("Running `stage` task...")
    val ret = sys.process.stringSeqToProcess(Seq("/bin/bash", "-c", "sh build.sh"))
    println(ret.!!)
  }

  /**
   * The setting that will be applied to all sub projects
   */
  lazy val commonSettings = Seq(
    organization := "com.sharkhacks5000",
    version := "1.0-SNAPSHOT",
    name := "sharkhacks5000",
    scalaVersion := "2.11.4",
    stage := stageTask
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
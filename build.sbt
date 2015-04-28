import NativePackagerKeys._
//enablePlugins(ScalaJSPlugin)

packageArchetype.java_application

name := "SharkHacks5000"

version := "1.0"

scalaVersion := "2.11.6"

//scalaJSStage in Global := FastOptStage

libraryDependencies ++= Seq(
  "io.dropwizard" % "dropwizard-core" % "0.8.1"
)

//enablePlugins(ScalaJSPlugin)

packageArchetype.java_application

name := "SharkHacks5000"

version := "1.0"

scalaVersion := "2.11.6"

//scalaJSStage in Global := FastOptStage

libraryDependencies ++= Seq(
  "com.twitter" % "finagle-http_2.11" % "6.25.0"
)

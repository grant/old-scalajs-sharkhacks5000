//enablePlugins(ScalaJSPlugin)
lazy val root = (project in file(".")).
  settings(
    name := "SharkHacks5000",
    version := "1.0",
    scalaVersion := "2.11.6"
  )

//scalaJSStage in Global := FastOptStage

libraryDependencies ++= Seq(
  "io.dropwizard" % "dropwizard-core" % "0.8.1",
  "io.dropwizard" % "dropwizard-assets" % "0.8.1",
  "org.scala-js" % "scalajs-library_2.11" % "0.6.2"
)

packageArchetype.java_application

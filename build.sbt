name := """anaraconsultant"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "com.typesafe.play" %% "play-mailer" % "5.0.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

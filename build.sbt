import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "me.dacol",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "dependency-injection",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalaLogging
  )

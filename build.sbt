import sbt._
import Process._
import Keys._

val specs2 = "org.specs2" %% "specs2-core" % "3.8.4" % "test"

lazy val commonSettings = Seq(
  organization := "kaemiin.hackerrank",
  version := "0.1.0",
  scalaVersion := "2.11.5"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "HackerRankGo",
    libraryDependencies += specs2
  )

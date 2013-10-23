import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "first-play"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    "org.scalatest" % "scalatest_2.10" % "1.9.2" % "test",
    "org.squeryl" %% "squeryl" % "0.9.5-6",
    "net.sf.barcode4j" % "barcode4j" % "2.0")

  val main = play.Project(appName, appVersion, appDependencies).settings( // Add your own project settings here      
  )

}

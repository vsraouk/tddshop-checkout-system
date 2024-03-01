ThisBuild / version := "0.2.0"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "tddshop-checkout-system",
    idePackagePrefix := Some("com.tddshop.exercise")
  )

libraryDependencies++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.2.18" % Test,
  )
}
fork in Test := true
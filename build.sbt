name := "scalapb-repro"

version := "1.0"

scalaVersion := "2.12.1"

scalaOrganization := "org.typelevel"

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Xlint"
)

PB.targets in Compile := Seq(
  scalapb.gen(flatPackage = true) -> (sourceManaged in Compile).value)

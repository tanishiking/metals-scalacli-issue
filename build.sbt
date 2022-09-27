val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-playground",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.8.0",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.3.9",
    Test / testOptions += Tests.Setup(() => Thread.sleep(6000)),
  )

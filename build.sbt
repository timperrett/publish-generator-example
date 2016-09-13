
name := "example"

organization := "io.verizon.build"

lazy val core = project.dependsOn(generators % "test->test")

lazy val generators = project

lazy val example = project.in(file(".")).aggregate(core, generators)

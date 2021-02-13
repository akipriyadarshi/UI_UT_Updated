name := "UI_UT_Final"

version := "0.1"

scalaVersion := "2.13.4"

val scalatest_dependency= "org.scalatest" %% "scalatest" % "3.0.8" % "test"
val mockito_dependency= "org.mockito" %% "mockito-scala" % "1.5.12" % "test"
lazy val Ques1_Ques2 = project.in(file("Ques1_Ques2")).settings(
  libraryDependencies +=scalatest_dependency
)
lazy val Ques3 = project.in(file("Ques3")).settings(
  libraryDependencies ++=Seq(scalatest_dependency, mockito_dependency)
)

lazy val root = project.in(file(".")).aggregate(Ques1_Ques2,Ques3)

import org.scalatest.Matchers._

name := "simple-test"

version := "0.1.0-SNAPSHOT"

val checkConductRIsRunning = taskKey[Unit]("")
val checkConductRIsStopped = taskKey[Unit]("")

checkConductRIsRunning := s"docker ps -q -f name=cond-".lines_!.size shouldBe 1

checkConductRIsStopped := s"docker ps -q -f name=cond-".lines_!.size shouldBe 0

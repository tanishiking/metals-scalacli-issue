package test

import cats.Id

object Cats extends App {
  val x: Id[Int] = 1
  println(x)
}

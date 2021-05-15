package org.javahorizon

object Closures {

  val number = 10
  var number2 = 20
  def add(x: Int) = {
    number + number2 + x
  }

  def main(args: Array[String]): Unit = {
    number2 = 15
    println(add(10))
  }

}

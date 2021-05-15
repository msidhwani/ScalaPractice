package org.javahorizon

object ExceptionHandling {

  def main(args: Array[String]): Unit = {
    try {
      val division = 10 / 0
    }
    catch {
      case e: ArithmeticException => println(e)
      case _ => println("Unknown Error")
    }
  }
}

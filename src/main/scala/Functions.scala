package org.javahorizon

object Functions {

  object Math{
    def add(x: Int, y: Int): Int = {
      return x+y
    }

    def subtract(x: Int, y: Int): Int = {
      x-y
    }

    def multiply(x: Int, y: Int) = x*y

    def divide(x: Int, y: Int) = x/y

    def square(x: Int) = x*x

  }



  def main(args: Array[String]) {
    println(Math.add(1,2))
    println(Math.subtract(1,2))
    println(Math.multiply(1,2))
    println(Math.divide(1,2))
    println(Math square 2) //Syntactical Sugar

  }


}

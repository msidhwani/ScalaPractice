package org.javahorizon

object AnonymousFunctions {

  object Math {
    def +(x: Int = 2, y: Int = 4): Int = {
      x + y
    }

    def **(x: Int = 2): Int = {
      x * x
    }

  }


  def main(args: Array[String]) {
    val add = (x:Int, y:Int) => x+y
    println(add(2,3))
    println(Math.+(1, 5))
    println(Math ** 4)

  }
}

package org.javahorizon

object HigherOrderFunction {

  def math(x: Double,y: Double,function: (Double, Double)=>Double)={
    function(x,y)
  }

  def main(args: Array[String]): Unit = {
      println(math(2,4,(x, y)=>x*y))
    println(math(2,4,_*_))
  }

}

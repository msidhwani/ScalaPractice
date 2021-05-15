package org.javahorizon

object TuplesDemo {

  def main(args: Array[String]): Unit = {
    val tuple = (1,2,true,"Yes")
    val tuple2 = Tuple1(1)
    println(tuple._3)
    println(tuple2._1)

    
  }

}

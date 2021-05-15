package org.javahorizon

object ArraysMutable {

  def main(args: Array[String]): Unit = {
    val array: Array[Int] = new Array[Int](5)
    array(0) = 1
    array(1) = 2
    for (element <- array) {
      println(element)
    }

    val array1 = new Array[Double](5)
    array1(0) = 1
    array1(1) = 2
    for (element <- array1) {
      println(element)
    }

    val array3 = Array(1,2,3,4,5)
    for (element <- array3) {
      println(element)
    }
    val  r = Array.concat(array, array3)
    println(r.size)
  }

}

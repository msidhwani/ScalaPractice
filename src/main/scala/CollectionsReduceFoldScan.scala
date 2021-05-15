package org.javahorizon

object CollectionsReduceFoldScan {

  val  list = List(1,2,3,4,5,6)
  def main(args: Array[String]): Unit = {

    println(list.reduceLeft((x,y)=>x+y))

  }

}

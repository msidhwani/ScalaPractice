package org.javahorizon

object ForLoopAndYield {

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 5){
      println(i)
    }

    /*for(i <- 1.to(5)){
      println(i)
    }

    for(i <- 1.until(5)){
      println(i)
    }*/

    //Nested Loop
    for(i <- 1 to 5; j <- 1 to 10){
      println(s"i=$i and j=$j")
    }

    //print list
    var list = List(1,2,3,4,5)
    for(i <- list){
      println(i)
    }

    println("Print Even numbers")
    for(i <- list; if i % 2 ==0){
      println(i)
    }

    println("Print Square")
    val result = for{
      i <- list
      if i % 2 ==0} yield {
      i * i
    }
    println(result)
  }

}

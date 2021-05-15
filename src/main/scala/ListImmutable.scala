package org.javahorizon

object ListImmutable {

  def main(args: Array[String]): Unit = {
    var list =  List(1,2,3,4)
    var names = List("Ramesh", "Kamlesh", "Swapnesh")
    println(0 :: list)
    println(list)
    println(1 :: 2 :: Nil)
    println(names.head)
    println(names.tail)
    println(names.isEmpty)
    println(names.reverse)
    println(List.fill(5)(2))
    names.foreach(println)
    var sum = 0
    list.foreach(x => sum = sum+x)
    list.foreach(sum +=_)
    println(sum)

  }

}

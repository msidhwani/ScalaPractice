package org.javahorizon

object CollectionsMapFilter {

  val list = List(1, 2, 3, 4, 5)
  val map = Map(1 -> "Ramesh", 2 -> "Kamlesh")

  def main(args: Array[String]): Unit = {
    println(list.map(_ * 2))
    println(list.map(x => x * 2))
    println(list.map(x => "Hi" * x))
    println(map.map(x => x + "Hi"))
    println("hello".map(_.toUpper))
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten)
    println(list.flatMap(x => List(x, x + 1)))
    println(list.filter(x=>x>2))
  }

}

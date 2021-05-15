package org.javahorizon

object OptionsDemo {

  val list = List(1,2,3,4,5)
  val map = Map(1->"Kaplesh",2->"Ramesh")
  val opt = Some(5)

  def main(args: Array[String]): Unit = {
    println(list(3))
    println(list.find(_ > 3).get)
    println(map.get(1).get)
    println(map.get(3).getOrElse("Not found"))
    println(opt.isEmpty)
  }
}

package org.javahorizon

object LazyInitialization {

  def main(args: Array[String]): Unit = {
    val testLazy = new TestLazy //Strict initialization of strict val
    testLazy.lazyVal //Lazy initialization on first use
  }


}

class TestLazy {

  val strict = {
    println("Strict")
  }

  lazy val lazyVal = {
    println("Lazy")
  }


}

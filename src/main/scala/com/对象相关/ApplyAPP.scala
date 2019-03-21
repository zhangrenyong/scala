package com.对象相关

/**
  * @author zry
  * @date 2018/7/10 23:00
  */

/**
  * object 本身是单例的
  * 概括:
  *    伴生类 伴生对象  apply
  */
object ApplyAPP {
  def main(args: Array[String]): Unit = {
//    for (i <- 1 to 10) {
//      ApplyTest.incr
//    }
//    println(ApplyTest.count)

    val b = ApplyTest();// ==>Object 的 apply()
//    val d = new ApplyTest();
//    d()// ==>调用的是class中的apply

    /**
      * 注释；
      * 类名() ==>调用的是object中的apply 方法
      * 对象() ==>调用的是class中的apply 方法
      */
  }
}

//如果有一个类 和一个object的名称一样 则为伴生类 伴生对象
/**
  * class ApplyTest 是object的伴生类
  */
class ApplyTest {
  println("class ApplyTest")
  def apply()={
    println("class apply")
  }
}

/**
  * object ApplyTest 是 class ApplyTest的伴生对象
  */
object ApplyTest {
  var count = 0
  def incr = {
    count += 1
  }

  //最佳实践: 在object的apply方法中去new Class
  def apply() = {
    println("ApplyTest")

    //在object 的applyTest中new class
    val d = new ApplyTest();
    d()
  }
}

package com.集合

/**
  * @author zry
  * @date 2018/7/10 23:30
  */

/**
  * 定长数组/变长数组
  */
object ArrayApp {
  def main(args: Array[String]): Unit = {

    //定长数组
    val a = new Array[String](5)//String类型的数组，长度是5
    println(a.length)
    a(1) = "first"
    println(a(1))
    // 2 定长数组
    val b = Array("a", "b", 1, "aaa");
    println(b(2))
    println(b.mkString)
    println(b.mkString(","))
    println(b.mkString("<", ",",">"))

    //变长数组
    val kbian = scala.collection.mutable.ArrayBuffer[Int]()
    println(kbian.toString().length)
    kbian += 1;
    kbian += (1,2,4)
    kbian ++= Array(6,7,8)

    kbian.insert(0, 0)
    println(kbian.mkString)

    kbian.toArray  //可变的数组 转成不可变的

//    for (value <- kbian) {
//      println(value)
//    }
//
//    for (value <- 0 until kbian.length) {
//      println(value)
//    }

    //倒序输出
//    for (value <- ( 0 until kbian.length).reverse ) {
//        println(value)
//    }
    for (value <- kbian.reverse ) {
      println(value)
    }
  }
}

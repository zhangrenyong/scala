package com.集合

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * @author zry
  * @date 2018/7/11 22:52
  */

/**
  * List  Set
  */
object ListApp extends App {
  val l = List(1,2,3,4,5)

  val l5 = ListBuffer[Int]();
  l5 += 2
  l5.toList //转成定长
  l5.toArray

  print(l.head)//1
  println(l.tail.head)//2

  def sum(nums:Int*) :Int = {
    if (nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail:_*)
    }
  }

  println(sum(1,2,3))

  //Set
  val set1 = scala.collection.mutable.Set[Int]()
  set1 += 1;
  set1 += 1;
  println(set1)

  //Map
  val map = scala.collection.mutable.HashMap[String, String]()
  map.put("a", "v1")
  println(map)
  println(map.get("a"))
  println(map.getOrElse("A", 100))

  val lMap = scala.collection.mutable.ArrayBuffer
    [scala.collection.mutable.HashMap[String, String]]();

  lMap += map
  println(lMap)

  //tuple
  val tp = new Tuple2(1,2)
  println(tp._1 + ":" + tp._2)
}

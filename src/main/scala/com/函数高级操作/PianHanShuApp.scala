package com.函数高级操作

import scala.util.Random

/**
  * @author zry
  * @date 2018/7/12 22:47
  */
/**
  * 偏函数 测试(被包含在花括号内没有match的一组case语句)
  */
object PianHanShuApp extends App {
  val names = Array("c", "c", "c");
  val name = names(Random.nextInt(names.length))

  name match {
    case "c" => println("first")
    case "b" => println("first_b")
    case _ if (name == "c1") => println("first_N")
  }

  /**
    * 如下偏函数 实现了上面的match模式匹配功能
    * @return
    */
  //A 输入参数类型  B 输出参数类型
  def test:PartialFunction[String, String] = {
    case "a" => "first"
    case "b" => "first_b"
    case _=> "first_N"
  }
  println(test("a"))
}

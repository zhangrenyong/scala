package com.函数高级操作

/**
  * @author zry
  * @date 2018/7/12 22:14
  */
object StringApp extends App {
  val s = "hello"
  val name = "pk"
  println(s"$s $name")//这种写法是字符串的插值用法

  //2 字符串多行表示
  val b =
    """
      |这是一个()
      |多行字符
      |串
    """.stripMargin
  println(b)
}

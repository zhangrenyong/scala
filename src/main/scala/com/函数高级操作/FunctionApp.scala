package com.函数高级操作

/**
  * @author zry
  * @date 2018/7/12 22:17
  */
/**
  * 匿名函数, currying 函数
  */
object FunctionApp extends App {


  //可以把匿名函数传给一个变量/作为一个函数的参数
  val m1 = (name:String) => println(name)//匿名函数
  m1("匿名函数测试")

  def test = (name:String) => println(name)
  test("匿名函数传递给一个函数")

  def sum(a:Int, b:Int) = a+b
  println(sum(1,1))
  //上面的函数 改写成curry函数 如下
  def sum2(a:Int)(b:Int) = a+b
  println("改写后的currying函数运行结果:" + sum2(1)(1))

  /**
    * 高阶函数测试
    */
  val l = List(1,2,3,4,5,6,7,8)
  l.foreach(print)
  //map:逐个去操作集合中的每个元素

  println(l.map((x:Int) => x + 1))
  println(l.map((x) => x + 1))
  println(l.map(x => x + 1))
  println(l.map(_ + 1)) //_ 代表集合中的每一个元素

  //filter
  l.filter(_ > 7).foreach(println)
  //reduce
  println(l.reduce(_+_))

  //flat
  val alist = List(List(1), List(2), List(3))
  println(alist)
  println(alist.flatten)//所有元素压扁

  alist.map(_.map(_*2)).foreach(print) //每个元素乘以2 遍历输出: List(2)List(4)List(6)
  alist.flatMap(_.map(_*2)).foreach(print)//每个元素乘以2 遍历输出246
}

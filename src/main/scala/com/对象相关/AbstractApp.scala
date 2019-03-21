package com.对象相关

/**
  * @author zry
  * @date 2018/7/10 22:55
  */
object AbstractApp {
  def main(args: Array[String]): Unit = {
    new Student2().speak();
  }

  abstract class Person2 {
    def speak;
    val name:String
    val age:Int
  }

  /**
    * Student2实现了Person2 抽象类
    */
  class Student2 extends Person2 {
    override def speak(): Unit = println("student2 speak")

    override val name: String = "test"
    override val age: Int = 100
  }
}

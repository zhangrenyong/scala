package com.对象相关

/**
 * Hello world!
 *
 */
object App {
  def main(args: Array[String]): Unit = {
//    println( "Hello World!" )
//    printMethod("zi ding yi value");
//    println(voidMethod)
//    method1("scala learn")
//    print(loadConf("pro"))
//    print(speed(100,10));

    //顺序打乱传递也可以，但是需要跟参数名称指定 命名参数
//    print(speed(time = 10, distance = 50));

    //可变参数
//    print(sum(100, 100))
    forMethod


  }

  def printMethod(value: String): Unit = {
    println(value)
  }

  def voidMethod() = 1+2;

  def method1(value:String): Unit = {
    println(value)
  }

  /**
    * 默认参数
    * @param name
    * @return
    */
  def loadConf(name:String ="spark.local.conf"):String={
//    name;
    return name;
  }

  def speed(distance:Float, time:Float): Float = {
    return distance/time;
  }

  def sum(number:Int*): Int ={
    var result = 0
    for (value <- number) {
      result += value
    }
//    println(result)
    return result
  }

  def forMethod(): Unit ={
    for (i <- 1 to 5 if i % 2 == 0) {
      println("i value : " + i)
    }
    val values  =  Array("a", "b", 1);
    for (v <- values) {
      println("Array :" + v)
    }
    values.foreach(v => println(v))

    var (num, sum) = (100, 0)
    while (num > 0) {
      sum += num
      num -= 1
    }
    println(sum)
  }

  /**
    * 需要掌握的:
    * 面向对象
    * 类的定义
    * 构造器
    * 继承与重写
    * 抽象类
    * 伴生对象，伴生类
    * apply
    * cse class
    * trait
    *
    */

  /**
    * 1面向对象
    * 封装: 属性, 方法的封装到类中
    * 继承: 父类和子类之间的关系
    * 多态：  ****** 父类引用指向子类对象  精髓所在 。。。。开发框架的基石
    */

}

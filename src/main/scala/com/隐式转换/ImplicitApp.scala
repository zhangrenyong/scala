package com.隐式转换

import java.io.File

/**
  * @author zry
  * @date 2018/7/12 22:59
  */
object ImplicitApp extends App {

  //定义一个隐式转换函数
  //这一行导致Man中有Super的方法
//  implicit def man2Superman(m: Man): Superman = new Superman(m.name)
 import ImplicitAspect.man2Superman

  val m1 = new Man("zs");
  m1.eat()
  m1.fly()

  //2

  //这里这个kuozhan(函数名称随便定义，要见名知意 最好) 函数的 入参是File， 然后返回值是一个 RichFile
  implicit def kuozhan(file: File): RichFile = new RichFile(file);
  val file = new File("D:\\gitClone\\scala\\src\\main\\scala\\com\\隐式转换\\概述")
  file.read1()


  /**
    * 隐式参数
    */
  def calcTax(amount: Float)(implicit rate: Float): Float = amount * rate

  implicit val currentTaxRate = 0.08F
  val tax = calcTax(50000F) // 4000.0
  println(tax)
  //上面三行: 如果编译器在上下文没有找到第二行代码会报错


  /**
    * 隐式地转换类型
    */
  val nm: Int = 5.5

  implicit def double2Int(arg: Double): Int = arg.toInt

  println("nm: " + nm) //这里有了隐式转换类型后 5.5 可以赋值给Int类型的 而不报错了

  /**
    * 隐式 转换类
    */
  implicit class TempClass(x: Int) {//该隐式转换作用于Int类型上
    def add1(v: Int) = {
      x + v
    }
  }

  //测试隐式转换类
  println(1.add1(2))
  //这里字符串是没有add1这个方法的， 因为写的隐式转换的类的类型是Int的
//  println("1".add1(2))

}

class Man(val name: String) {
  def eat(): Unit = {
    println(s"man[ $name ] fly...")
  }
}

class Superman(val name: String) {
  def fly(): Unit = {
    println(s"Superman[$name ]fly...")
  }
}

/**
  * 扩展java的 File的功能
  *
  * @param file
  */
class RichFile(val file: File) {
  def read1(): Unit = {
    println(scala.io.Source.fromFile(file.getPath))
  }
}






package com.异常处理

/**
  * @author zry
  * @date 2018/7/12 21:54
  */

/**
  * 1 异常处理
  * 2 case class欧式匹配
  */
object ExceptionApp extends App {
  try {
    val i = 10/0;
    println(i)
  }catch {
    case e: ArithmeticException => println("10/0")
    case e: Exception => println(e.getMessage)
  } finally {
    //资源释放等等
  }

  class Person
  case class CTO(name:String, floor: String) extends Person
  case class Employee(name:String, floor:String) extends Person
  case class Other(name:String) extends Person

  /**
    * case class 模式匹配
    * @param p
    */
  def caseMatch(p: Person): Unit = {
    p match {
      case CTO(name,floor) => println(s"cto name is $name, floor is $floor")
      case Employee(name, floor) => println(s"employee name is $name, floor is $floor")
      case _=> println("--end---")
    }
  }
  caseMatch(CTO("a", "a1"));//这里为什么不用new 一个对象出来？

  """
    下面是 Some None 模式匹配测试
  """
  val grades = Map("a" -> "a1", "b" -> "b1")
  def getGrade(name: String): Unit = {
    val grade = grades.get(name)
    grade match {
      case Some(grade) => println(s"your name is $grade")
      case None => println("kong de ")
      case  _=> println("---Some 模式匹配结束---")
    }
  }

  getGrade("a")
}

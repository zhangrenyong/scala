package com.模式匹配

import scala.util.Random

/**
  * @author zry
  * @date 2018/7/11 23:25
  */
object MatchApp extends App {
  val names = Array("c", "c", "c");
  val name = names(Random.nextInt(names.length))

  name match {
    case "a" => println("first")
    case "b" => println("first_b")
    case _ if (name == "c1") => println("first_N")
  }

  /**
    * Array 模式匹配
    * @param array
    */
  def greeting(array:Array[String]): Unit ={
    array match {
      case Array("a", "b") => println("--------")
      case Array(x1, y1) => println("-----222222---")
      case Array("a", _*) => println("=====end===")
    }
  }

  /**
    * List 模式匹配
    * @param list
    */
  def greeting1(list:List[String]): Unit ={
    list match {
      case List("z") => println("z--------")
      case x::y::Nil => println("-----222222---")
      case _ => println("=====end===")
    }
  }

  def greeting2(obj:Any): Unit ={
    obj match {
      case a:Int => println("--------")
      case Array(x1, y1) => println("-----222222---")
      case b:String => println("=====end===")
      case b1:Map[_,_] => b1.foreach(println)
      case _=> println("---end----")
    }
  }

  greeting2(Map(1 -> 2))
}

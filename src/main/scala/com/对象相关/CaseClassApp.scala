package com.对象相关

/**
  * @author zry
  * @date 2018/7/10 23:16
  */

/**
  * 概括：
  * 1: case class
  *    case class不用new 直接使用
  *
  * 2: trait
  *
  *  这里出了 第一个trait 前面用的是extends 后面的trait都是用with
  *  eg:
  *  class SparkConf(loadDefaults: Boolean) extends Cloneable with Logging with Serializable
  */
object CaseClassApp {
  def main(args: Array[String]): Unit = {
    println(Dog("hi"))
    println(Dog("hi") == Dog("hi"))
  }
  //case class 不用new
  case class Dog(name: String) {
    var age = 100;
  }

  trait Body {
    def todo1;
  }

  trait Partition extends Serializable {
    /**
      * Get the partition's index within its parent RDD
      */
    def index: Int

    // A better default implementation of HashCode
    override def hashCode(): Int = index

    override def equals(other: Any): Boolean = super.equals(other)
  }

}



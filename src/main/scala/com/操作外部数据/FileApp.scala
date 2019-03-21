package com.操作外部数据
import scala.io._
/**
  * @author zry
  * @date 2018/7/14 13:17
  */
object FileApp extends App {
  val file = Source
    .fromFile("D:\\gitClone\\scala\\src\\main\\scala\\com\\操作外部数据\\概述")
  (scala.io.Codec.ISO8859)
    def readLine(): Unit ={
      for (value <- file.getLines()) {
        println(value)
      }
    }
  def readLine1(): Unit ={
    for (value <- file) {//这里是一个char 一个的读
      println(value)
    }
  }

  //读取网络内容
  def readFromNetWork(): Unit ={
    val baiduFile = Source.fromURL("http://www.baidu.com")
    for (v <- baiduFile.getLines()) {
      println(v)
    }
  }
  readFromNetWork()
}

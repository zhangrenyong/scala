package com.操作外部数据

import java.io.{FileInputStream, FileReader, InputStreamReader}

import scala.xml.XML

/**
  * @author zry
  * @date 2018/7/14 13:49
  */
object XMLApp extends App {
  def loadXml(): Unit ={
    println(this.getClass.getClassLoader.getResource("xmlData.xml").getPath)
//    val xml = XML.load(this.getClass.getClassLoader.getResource("xmlData.xml"))
    val xml = XML.load(new FileReader("D:\\gitClone\\scala\\src\\main\\resources\\xmlData.xml"))
    val headName = xml \ "a" \ "b"
    println(headName)
//    println(xml)
  }
  loadXml()


}

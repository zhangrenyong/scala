//package com.对象相关
//
///**
//  * Apply怎么用它来实现单例模式
//  */
//class ApplyTest private{  //添加private隐藏构造器
//  def sayHello(){
//    println("hello jop")
//  }
//}
//
//object ApplyTest{
//  var instant:ApplyTest=null
//  def apply() ={
//    if(instant==null) {
//      instant=new ApplyTest
//    }
//    instant
//
//  }
//}
//
//object ApplyDemo {
//  def main(args:Array[String]){
//      val t=ApplyTest()
//      t.sayHello()
//  }
//  new ApplyTest();
//}

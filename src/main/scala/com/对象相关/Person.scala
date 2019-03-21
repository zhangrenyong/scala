package com.对象相关

//类默认是public级别的
class Person{
  var age=18  //字段必须得初始化()
  def Age=age //这个是方法，没有参数可以省略()
  def incremen(){this.age+=1}
}
 
 
class Student{
  var age=20     //底层编译器会自动为私有的age添加get和set的公有方法,可以理解为伪public类型
  private[this] var gender="male" //private[this] 只有该类的this可以使用
  private var name="clow" //声明了private,底层编译器会自动为私有的name添加get和set的私有方法
  //但是可以自己定义属性方法
  def getName=this.name
  def setName(value:String){this.name=value}
}
 
//构造器的使用
class Teacher {
  var age: Int = _
  var name: String = _  //可以预留
 
  //重载的构造器和C#里面的public Teacher(){}类似
  def this(age: Int, name: String){
    this() //必须得调用一次主构造器
    this.age=age
    this.name=name
  }
}

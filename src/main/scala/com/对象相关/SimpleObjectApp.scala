package com.对象相关

/**
  * @author zry
  * @date 2018/7/9 23:57
  */
object SimpleObjectApp {
  def main(args: Array[String]): Unit = {
//    val person = new People()
//        person.name = "scala"
//        println(person.name + ":" + person.age)
//        println(person.eat())
//        println(person.age)
//        person.todo()
  }

//    new Person("z", 100);
//    new Person("z", 100, "hd");

    var student = new Student("a", 100, "b");
    print("---: " + student.toString )
//  }

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
    * 继承: 分类和子类之间的关系
    * 多态：  ****** 父类引用指向子类对象  精髓所在 。。。。开发框架的基石
    */
  class People {
    var name: String = _
    val age: Int = 10

    private[this] val value = "class jibie"

    def todo(): Unit = {
      println(value)
    }

    def eat(): String = {
      name
    }

  }


  /**
    * 构造器
    *
    * @param name
    * @param age
    */
  class Person(val name: String, val age: Int) {//主构造器
    println(name)
    var school = "xuexiaomingc";
    println("Person 构造器1")
    def this(name:String, age:Int, gender:String) {
      //附属构造器的第一行必须调用主构造器 或者其他和构造器
      this(name, age);
      this.school = gender;
      println("Person 构造器2" + school)
    }

    /**
      * 继承过来后的  重写 demo
      * @return
      */
    override def toString:String = {
//      super.toString
      "==========="
    }
  }

  /**
    * 继承
    * @param name
    * @param age
    * @param stu  这个是子类特有的属性 参数必须要有var/val 来定义， 否则访问不到
    */
  class Student(name:String, age:Int, var stu:String) extends Person(name, age) {
    println("Student 构造器1")
    def this(name:String, age:Int, stu:String, value:String) {
      this(name, age, stu);
      println("Student 构造器2")
    }
  }
}

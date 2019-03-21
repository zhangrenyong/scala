package quickScala.流程控制和函数_1

import com.google.common.base.Preconditions

import scala.util.control.Breaks

/**
  * @author zry
  * @date 2018/8/13 20:48
  */
object AppTest extends App {

  // scala 的if条件表达式 有返回值 如下:
  val v1 = if (2 > 1) 100 else 50
  println(v1)

  var v2 = 5;
  var v3 = 6;
  if ( 2 > 1)  v2 += 1;v3+=2
  println(s"$v2, $v3")

//  输入
  var inputData = readLine("your name:")
  println(inputData)

  //循环
  var nValue: Int = 5
  while (nValue > 0) {
    println("nvalue: " + nValue)
    nValue -= 1
  }

  //for(i <- 表达式)
  for (i <- 1 to 6) {
    println(s"$i")
  }

  val s = "hello"
  for (i <- 0 until s.length) {
    println(s"$i")
//    Breaks.break()//退出
  }

  //默认参数
  def decorate(str: String, left:String="[", right: String="]") = left.concat(str).concat(right);
  println(decorate("test", "<", ">"))

  //可变参数
  def sum(v: Int*): Int ={
    Preconditions.checkNotNull(v)
    var sum = 0
    for (i <- v) {
      sum += i
    }
    return sum
  }
  println("sum() : " +sum(1 to 5: _*))//1 to 5:_* 当成参数序列来处理

  lazy val t = 10;//当用lazy 来修饰val 定义的变量时 他的初始化 是在第一次使用时才进行的
}

package quickScala.数组相关操作_2

/**
  * @author zry
  * @date 2018/8/13 21:51
  */
/**
  * 数组相关操作
  */
object ArrayOperate extends App {
  /**
    * 定长数组
    */
  val nums = new Array[Int](10) //10个整数的数组，所有元素初始化值为0
  //访问数组元素用()
  println(nums(1)) //返回值为 0

  val s = Array("Hello", "World")//长度为2的Array[String]

  /**
    * 变长数组: 缓冲数组
    */
  import scala.collection.mutable.ArrayBuffer
  val b = ArrayBuffer[Int]()//或者 new ArrayBuffer[Int]这样写法也行

  //+= 是在尾端添加一个元素
  b += 1 //
  println(b) // 值为:  ArrayBuffer(1)
  b += (2,3,4,5)// 结果为:  ArrayBuffer(1, 2, 3, 4, 5)

  // ++= 可以添加任何集合
  b ++= Array(10,15,20)// 结果: ArrayBuffer(1, 2, 3, 4, 5, 10, 15, 20)

  //移除最后2个元素
  b.trimEnd(2) //结果: ArrayBuffer(1, 2, 3, 4, 5, 10)

  //todo 在数组尾端 移除添加是一个高效的操作， 也可以在任意位子上插入或移除操作，
  //todo 但这样操作并不高效 --那个位子上之后的元素都会平移

  b.insert(0, 100, 200) //ArrayBuffer(100, 200, 1, 2, 3, 4, 5, 10)

  //移除第2个位子上的元素
  b.remove(1) //ArrayBuffer(100, 1, 2, 3, 4, 5, 10)

  //在下标1之后 移除2个元素
  b.remove(1, 2)//ArrayBuffer(100, 3, 4, 5, 10)

  //缓冲数组 转数组
  var arr = b.toArray


  //数组 转缓冲数组
  var buffArr = arr.toBuffer //ArrayBuffer(100, 3, 4, 5, 10)

  /**
    * 数组遍历 和 数组缓冲
    */

  //遍历 数组/缓冲数组方式
  for (i <- 0 until arr.length) {
    //变量i的取值为 0 到arr.length - 1
    println(s"$i :" + arr(i))
  }

  //for ( i <- 区间) 这种写法会让i 遍历该区间的所有值
   val gt = 0 until (arr.length, 2) //返回值: inexact Range 0 until 5 by 2

  /**
    * 数组转换
    */
//   for (...) yield 循环会创建一个和原来的集合相同的新集合。 结果包含yield后面的表达式(的值) 每次迭代对应一个
  val newBuff = for (elem <- buffArr if  elem == 100 ) yield {
    elem * 8
  }

  println(newBuff) //ArrayBuffer(800)

  //另一种写法
  val newBuff2 = buffArr.filter(_ == 100).map(_ * 8)
  println(newBuff2)//ArrayBuffer(800)

  /**
    * 常用算法
    */
  println(Array(1,2,3,4,5).sum) //15
  println(buffArr.max)//100

  //sorted方法将数组或者 数组缓冲 排序并返回经过排序的数组或者数组缓冲， 这个过程不会修改原始版本
  val bBuff = ArrayBuffer(1,7,2,9)
  val bSorted = bBuff.sorted
  println(bSorted)

  //隐式转换Buffer 转List ， 不加下面那一行导入 最后一行会报错
  import scala.collection.JavaConversions.bufferAsJavaList;
  val command = ArrayBuffer("ls", "-al", "/home/test")
  val pb = new ProcessBuilder(command)
}

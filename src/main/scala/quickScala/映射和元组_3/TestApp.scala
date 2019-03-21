package quickScala.映射和元组_3

/**
  * @author zry
  * @date 2018/8/13 22:58
  */
object TestApp extends App {
  //构造一个映射
  val scores = Map("A" -> 100, "B" -> 50)//构造出一个不可变的Map[String, Int] 其值不能被改变
  val scores1 = scala.collection.mutable.Map("A" -> 100, "B" -> 50) //可变的
  val scores2 = scala.collection.mutable.HashMap[String, Int]()//构造一个空的映射
  println(scores("A"))//100. 当获取的key 不存在时 会抛异常 eg: NoSuchElementException: key not found
  scores1 += ("A"->200, "C"-> 60)
  println(scores1)//Map(A -> 200, C -> 60, B -> 50)

  /**
    * 迭代
    */
  //for((k,v) <- 映射) 处理k和v

  /**
    * 元组是不同类型值得集合， 是通过将单个的值包括在圆括号中构成 eg (1,2, "hello") ->类型为Tupl3[Int, Int, String]
    */

}

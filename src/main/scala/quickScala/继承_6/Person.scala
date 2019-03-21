package quickScala.继承_6

import scala.io.Source

/**
  * @author zry
  * @date 2018/8/16 23:06
  */
class Person {

}

class Employ extends Person {

}

object Test extends App {
  val p = new Person()
  if (p.isInstanceOf[Employ]) {//类似java中instanceOf
    val p1 = p.asInstanceOf[Employ]; //类似java中(Employ)p 强转
  }
  import sys.process
  val numPattern = "[0-9]+".r

}
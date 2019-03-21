package quickScala.类_4

/**
  * @author zry
  * @date 2018/8/14 11:06
  */
class Counter {
  //这里未被val 修饰 故只有getter方法(value)， 有setter方法(value_  -> 重新定义时 的方法的名称)
  private var privateValue = 0;

  //这里被val 修饰 故只有getter方法， 没有setter方法
  val value1 = 0;

  /**
    *
    */
  private [this] var value2 = 10 //类似某个对象.value2 这样的访问不被允许

  def increment() {
    privateValue += 1
  }

  def current() = privateValue //提供一个方法来访问私有变量

  //设置setter方法
  def value_=(newValue: Int): Unit = {
    //这里有个=
    if (newValue > 5) {
      privateValue = newValue;
    }
  }

  def value = privateValue

  def toD() = {
    privateValue
  }
}

object Test extends App {

  val counter = new Counter
  val counter1 = new Counter() //第二种写法
  println(counter.current())
  counter.increment()
  println(counter.current) //对于会修改状态的方法 推荐调用时带圆括号， 即 对于改值器调用用()， 对于取值器调用 不用()
  counter.value = 2
  println(counter.value)
  counter.value = 8
  println(counter.value)
  println("===" + counter.toD)


}

class Person(var name:String, var age:Int) {
  //()中的内容为主构造器的参数
}

class Person1(name:String, age:Int) {
  //()中的内容为主构造器的参数 ,且未用var val 修饰 故 等价于 private [this] val 字段的效果
}

class Person12 private(name:String, age:Int) {
  //()中的内容为主构造器的参数 ,且未用var val 修饰 故 等价于 private [this] val 字段的效果
  //且这里主构造器用private 修饰， 则该主构造器是私有的
}

/*
   主构造器参数                        生成的字段/方法
   name:String                        对象私有字段，如果没有方法使用name，则没有改字段
   private val/var name:String        私有字段，私有的getter和setter方法
   val/var name:String                私有字段，公有的getter和setter方法
   @BeanProperty val/var name:String  私有字段，公有的Scala版和JavaBeans版的getter和setter方法
 */

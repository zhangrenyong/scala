package com.隐式转换

class SwingType{
  def  wantLearned(sw : String) = println("兔子已经学会了"+sw)
}
class AminalType
object AminalType extends  App{
  import com.隐式转换.swimming._
  val rabbit = new AminalType
    rabbit.wantLearned("breaststroke")         //蛙泳
}
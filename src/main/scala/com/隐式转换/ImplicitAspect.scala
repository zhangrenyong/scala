package com.隐式转换

/**
  * @author zry
  * @date 2018/7/14 13:04
  */

/**
  * 封装隐式转换 统一管理
  */
object ImplicitAspect {
  implicit def man2Superman(m: Man): Superman = new Superman(m.name)
}

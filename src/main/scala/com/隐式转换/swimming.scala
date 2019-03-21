package com.隐式转换

object swimming{
  implicit def learningType(s : AminalType) = new SwingType
}
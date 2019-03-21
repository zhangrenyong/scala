package com.操作外部数据

import java.sql.{Connection, DriverManager, ResultSet, Statement}

/**
  * @author zry
  * @date 2018/7/14 13:27
  */
object MySqlApp extends App {
  val driver="com.mysql.jdbc.Driver"
  val url="jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
  val user="root"
  val passwd= "123456"
  var connection:Connection = null
  var statement: Statement = null
  var resultSet: ResultSet = null
  try {
      classOf[com.mysql.jdbc.Driver]
      connection = DriverManager.getConnection(url, user, passwd)
      statement = connection.createStatement()
      resultSet = statement.executeQuery("select host, user from user")
    while (resultSet.next()) {
      val host = resultSet.getString("host")
      val user = resultSet.getString("user")
      println(s"$host, $user")
    }
  } catch {
    case e: Exception => {
      e.printStackTrace()
      throw e;
    }
  } finally {
    if (connection != null) {
      connection.close()
    }
  }
}

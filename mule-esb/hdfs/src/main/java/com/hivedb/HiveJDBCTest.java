package com.hivedb;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
 
public class HiveJDBCTest {
  private static String driverName = "org.apache.hive.jdbc.HiveDriver";
 
  public static void main(String[] args) throws SQLException {
    try {
      Class.forName(driverName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Connection con = DriverManager.getConnection("jdbc:hive2://172.16.1.75:10000/default", "hive", "hive@123");
    Statement stmt = con.createStatement();
    String sql = "select * from locations";
    ResultSet res = stmt.executeQuery(sql);
 
    System.out.println("Running: " + sql);
    res = stmt.executeQuery(sql);
    while(res.next()) {
      try {
		System.out.println(res.getInt("location_id"));
	} catch (Exception e) {
	}
      try {
		System.out.println(res.getInt("location_code"));
	} catch (Exception e) {
	}
      try {
		System.out.println(res.getString("location_name"));
	} catch (Exception e) {
	}
    }
    
  }
}
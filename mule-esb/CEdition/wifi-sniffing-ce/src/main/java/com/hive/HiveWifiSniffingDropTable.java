package com.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class HiveWifiSniffingDropTable {

	private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";
	private final static Logger logger = Logger
			.getLogger(HiveWifiSniffingDropTable.class.getName());

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		// Register driver and create driver instance
		Class.forName(driverName);

		// get connection
		Connection con = DriverManager.getConnection(
				"jdbc:hive2://xxx.xx.x.75:10000/default", "hive", "hive@123");

		// create statement
		Statement stmt = con.createStatement();

		// execute statement
		stmt.executeQuery("DROP TABLE IF EXISTS employeezx;");
		logger.info("Drop table successful.");

		con.close();
	}
}

package com.hive;

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
		/**
		 * Connection con = DriverManager.getConnection(
		 * "jdbc:hive2://172.16.1.75:10000/default", "hive", "hive@123");
		 */
		
		Connection con = DriverManager
				.getConnection(
						"jdbc:hive2://bbh-1432449493.us-east-1.elb.amazonaws.com:11983/att_rlo",
						"hive", "hive@123");
		Statement stmt = con.createStatement();
		
		/**
		 * String sql = "select * from locations";
		 */
		
		String sql = "select * from table_rlo_receiving where partnumber='S631A' limit 10";
		ResultSet res = stmt.executeQuery(sql);
		System.out.println("Running: " + sql);
		res = stmt.executeQuery(sql);
		while (res.next()) {
			try {
				/**
				 * System.out.println("location_id : "+res.getInt("location_id"));
				 */
				System.out.println("receiptdatetime : "
						+ res.getTimestamp("receiptdatetime"));
			} catch (Exception e) {
				/**
				 * System.out.println("Exception while fetching location_id !!");
				 */
				System.out
						.println("Exception while fetching receiptdatetime !!");
			}
			try {
				/**
				 * System.out.println("location_code : "+res.getString("location_code"));
				 */
				System.out.println("pieceidentifier : "
						+ res.getString("pieceidentifier"));
			} catch (Exception e) {
				/**
				 * System.out.println("Exception while fetching location_code !!");
				 */
				System.out
						.println("Exception while fetching pieceidentifier !!");
			}
			try {
				/**
				 * System.out.println("location_name : "+res.getString("location_name"));
				 */
				System.out.println("receiptidentifier : "
						+ res.getString("receiptidentifier"));
			} catch (Exception e) {
				/**
				 * System.out.println("Exception while fetching location_name !!");
				 */
				System.out
						.println("Exception while fetching receiptidentifier !!");
			}

			try {
				System.out.println("partnumber : "
						+ res.getString("partnumber"));
			} catch (Exception e) {
				System.out.println("Exception while fetching partnumber !!");
			}
			try {
				System.out.println("partdescription : "
						+ res.getString("partdescription"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching partdescription !!");
			}
			try {
				System.out.println("devaluedpartnumber : "
						+ res.getString("devaluedpartnumber"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching devaluedpartnumber !!");
			}
			try {
				System.out.println("devaluedpartdescription : "
						+ res.getString("devaluedpartdescription"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching devaluedpartdescription !!");
			}
			try {
				System.out.println("receipttypename : "
						+ res.getString("receipttypename"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching receipttypename !!");
			}
			try {
				System.out.println("rmareturnreasonname : "
						+ res.getString("rmareturnreasonname"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching rmareturnreasonname !!");
			}
			try {
				System.out.println("rmasaleschannelname : "
						+ res.getString("rmasaleschannelname"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching rmasaleschannelname !!");
			}
			try {
				System.out.println("inventorystatusname : "
						+ res.getString("inventorystatusname"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching inventorystatusname !!");
			}
			try {
				System.out.println("rmacomment : "
						+ res.getString("rmacomment"));
			} catch (Exception e) {
				System.out.println("Exception while fetching rmacomment !!");
			}
			try {
				System.out.println("rmareturncodename : "
						+ res.getString("rmareturncodename"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching rmareturncodename !!");
			}
			try {
				System.out.println("rmatrackingnumber : "
						+ res.getString("rmatrackingnumber"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching rmatrackingnumber !!");
			}
			try {
				System.out.println("supplierpartnumber : "
						+ res.getString("supplierpartnumber"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching supplierpartnumber !!");
			}
			try {
				System.out.println("jobid : " + res.getInt("jobid"));
			} catch (Exception e) {
				System.out.println("Exception while fetching jobid !!");
			}
			try {
				System.out.println("insertdatetime : "
						+ res.getString("insertdatetime"));
			} catch (Exception e) {
				System.out
						.println("Exception while fetching insertdatetime !!");
			}
		}

	}
}
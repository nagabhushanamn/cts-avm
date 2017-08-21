package com.pm.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.pm.model.Product;

public class UpdateProduct {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(235);
		product.setName("Mobile");
		product.setMakeDate(new Date());
		product.setDescription("New iphone");

		// -------------------------------------

		Connection con = null;

		// DriverManager.registerDriver(new Driver());
		try {
			// register Jdbc-Driver with JDBC API's DriverManager

			// step-1
			Class.forName("com.mysql.jdbc.Driver");

			// step-2
			String url = "jdbc:mysql://localhost:3306/pm";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);
			// System.out.println("Connected");

			String sql = "update pm.Products set price=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, 1000.00);
			ps.setInt(2, 235);

			int count = ps.executeUpdate();
			if (count == 1)
				System.out.println(" Product Updated");
			else
				System.out.println("Failed..");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

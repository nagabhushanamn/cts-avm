package com.pm.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.pm.model.Product;

public class InsertProduct {

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

			String sql = "insert into pm.PRODUCTS values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setDouble(3, product.getPrice());
			ps.setDate(4, new java.sql.Date(product.getMakeDate().getTime()));
			ps.setString(5, product.getDescription());

			int count = ps.executeUpdate();
			if (count == 1)
				System.out.println("New Product Added");
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

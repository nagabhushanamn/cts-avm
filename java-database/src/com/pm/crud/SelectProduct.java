package com.pm.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pm.model.Product;

public class SelectProduct {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<>();

		Connection con = null;

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

			String sql = "select * from pm.PRODUCTS p where p.name=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "Laptop");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setMakeDate(rs.getDate(4));
				product.setDescription(rs.getString(5));

				productsList.add(product);

			}

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

		// -----------------------------------------------------

		for (Product product : productsList) {
			System.out.println(product);
		}

	}

}

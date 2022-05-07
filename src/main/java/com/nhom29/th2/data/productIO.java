package com.nhom29.th2.data;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class productIO {
    private static String DB_INFO = "jdbc:mysql://localhost:3306/productmaintenance";
    private static String USER_NAME = "root";
    private static String PASS = "sa123456";

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(DB_INFO, USER_NAME, PASS);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<product> getAllProduct() throws SQLException {
        List<product> list = new ArrayList<>();
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        try {
            String sql = "select * from product";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs != null && rs.next()) {
                String code = rs.getString(1);
                String description = rs.getString(2);
                Double price = rs.getDouble(3);
                list.add(new product(code, description, price));
            }
        } finally {
            stmt.close();
            conn.close();
        }
        return list;
    }


}

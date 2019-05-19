
package com.demo.Quanlythuvien;



//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;

public class DBConnector {

    final static String SERVER = "localhost";
    final static String PORT = "3306";
    final static String DB_NAME = "quanlythuvien";
    final static String DB_USER = "root";
    final static String DB_PASS = "";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:mysql://").append(SERVER).append(":").append(PORT).append("/").append(DB_NAME);

        return DriverManager.getConnection(builder.toString(), DB_USER, DB_PASS);
    }

}

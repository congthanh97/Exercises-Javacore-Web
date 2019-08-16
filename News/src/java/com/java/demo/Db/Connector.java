/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.Db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
public class Connector {
    
    final static String SERVER = "localhost";
    final static String PORT = "3306";
    final static String DB_NAME = "new";
    final static String DB_USER = "root";
    final static String DB_PASS = "";

  
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:mysql://").append(SERVER).append(":").append(PORT).append("/").append(DB_NAME).append("?useUnicode=yes&characterEncoding=UTF-8");

        Connection conn = DriverManager.getConnection(builder.toString(), DB_USER, DB_PASS);

        return conn;
    }
}

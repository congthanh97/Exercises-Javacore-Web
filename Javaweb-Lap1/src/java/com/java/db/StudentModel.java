package com.java.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.java.db.*;
import java.sql.ResultSet;

public class StudentModel {

    private Connection conn = null;

    public StudentModel() throws ClassNotFoundException, SQLException, Exception {
        this.conn = new DBConnector().getConnection();
    }

    
    public Student Auth(String email,String password)throws Exception{
       //Connection conn = Dbconnector.getConnection();
        String sql = "SELECT * FROM admin WHERE email = ? AND password = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        Student student = null;
        if (rs.next()) {
            // Admin(int id, String name, String address, String email, String password,int phone, String avartar, int level, int status) {  
           // admin = new Admin(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("email"), rs.getString("password"), rs.getInt("phone"), rs.getString("avartar"), rs.getInt("level"), rs.getInt("status"));
           student = new Student(rs.getInt("id"),rs.getString("name"), rs.getString("email"),  rs.getString("address"),  rs.getString("password"));
        }
        return student;
    }
    
    public int add(Student c) throws Exception {
        String sql = "INSERT INTO users(name,address,email,password) VALUES(?,?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, c.getName());
        pstmt.setString(2, c.getAddress());
        pstmt.setString(3, c.getEmail());
        pstmt.setString(4, c.getPassword());
        return pstmt.executeUpdate();
    }

}

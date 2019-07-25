/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class StudentModel {
    
    public List<Student> getStudents() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getString("major"));
            s.setDob(rs.getString("dob"));
            list.add(s);
        }
        return list;
    }
    
    public List<Student> getStudentsByMajor(String major) throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "SELECT * FROM sinhvien WHERE major = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, major);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getString("major"));
            s.setDob(rs.getString("dob"));
            list.add(s);
        }
        return list;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.bean.Student;
import com.java.demo.db.Connector;
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

    public final static int ROW_PER_PAGE = 6;

    private Connection conn = null;

    public StudentModel() throws ClassNotFoundException, SQLException, Exception {
        this.conn = new Connector().getConnection();
    }

    public List<Student> getAll() throws Exception {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM users";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setAddress(rs.getString("address"));
            list.add(s);
        }
        return list;
    }

    public int add(Student s) throws Exception {
        String sql = "INSERT INTO users(name, email, address) VALUES(?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, s.getName());
        pstmt.setString(2, s.getEmail());
        pstmt.setString(3, s.getAddress());
        return pstmt.executeUpdate();
    }

    public int update(Student s) throws Exception {
        String sql = "UPDATE users SET name = ?, email = ?, address = ? WHERE id = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, s.getName());
        pstmt.setString(2, s.getEmail());
        pstmt.setString(3, s.getAddress());
        pstmt.setInt(4, s.getId());
        return pstmt.executeUpdate();
    }

    public int delete(int id) throws Exception {

        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }

    //tra ve id nguoi dung
    public Student getById(int id) throws Exception {

        String sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Student c = new Student();
        while (rs.next()) {
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setAddress(rs.getString("address"));
            c.setEmail(rs.getString("email"));
        }
        return c;
    }

}

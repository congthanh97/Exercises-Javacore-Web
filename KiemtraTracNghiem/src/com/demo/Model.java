package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {

    public boolean auth(String email, String pass) throws Exception {
        Connection conn = DbConnector.getConnection();
        String sql = "SELECT * FROM student WHERE email = ? AND pass = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        ResultSet rs = pstmt.executeQuery();
        return rs.next();
    }

    public List<Question> question() throws Exception {
        String chose = null;
        List<Question> list = new ArrayList();
        Scanner input = new Scanner(System.in);
        Connection conn = DbConnector.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * from question";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Question qt = new Question();
            System.out.printf("\n\rCau hoi %s: %s",rs.getString(1), rs.getString(2));
            System.out.printf("\n\rA: " + rs.getString(3));
            System.out.printf("\n\rB: " + rs.getString(4));
            System.out.printf("\n\rC: " + rs.getString(5));
            System.out.printf("\n\rD: " + rs.getString(6));
            System.out.printf("\n\rChoose: ");
            chose = input.nextLine();
            qt.setTl(chose);
            list.add(qt);
        }
        return list;
    }

    public List<Answer> answers() throws Exception {
        Connection conn = DbConnector.getConnection();
        List<Answer> list = new ArrayList<>();
        String sql = "SELECT correct FROM question";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Answer ans = new Answer();
            ans.setAns(rs.getString(1));
            list.add(ans);
        }
        return list;
    }

    public void Check() throws Exception {
        int count = 0;
        List<Question> listCh = question();
        List<Answer> listAN = answers();
        for (int i = 0; i < listAN.size(); i++) {
            if (listCh.get(i).getTl().equals(listAN.get(i).getAns())) {
                count++;
            } else {
            }
        }

        System.out.print("\n\rBan tra loi dung duoc: " + count + " / " + listAN.size());
        System.out.println("\n\r");

    }

}

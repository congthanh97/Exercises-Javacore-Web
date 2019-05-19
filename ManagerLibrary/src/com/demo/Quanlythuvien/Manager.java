package com.demo.Quanlythuvien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager {

    public void bai5() throws SQLException, Exception {
        Connection conn = DBConnector.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "select sothe,ten,khoa FROM DOCGIA order by sothe asc";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.printf("\n%10s %10s %10s\n\r","So the","Ten","Khoa");
        while (rs.next()) {
            System.out.printf("\n%10s %10s %15s\n\r",rs.getString("sothe"),rs.getString("ten"),rs.getString("Khoa"));
        }

    }

    public ResultSet Bai6(String bookName, String date) throws Exception {
        //1. Ket noi db
        Connection conn = DBConnector.getConnection();
        String sql = " select dg.ten from PHIEUMUON as pm join DOCGIA as dg on pm.sothe =  dg.sothe join SACH   as s  on s.masach = pm.masach where s.ten = ? and pm.ngaymuon =  STR_TO_DATE(?, '%d/%m/%Y')";
        //System.out.println(sql);
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, bookName);
        pstmt.setString(2, date);
        //System.out.println(pstmt);
        return pstmt.executeQuery();
    }

    public ResultSet bai7(String date1, String date2) throws SQLException, Exception {
        Connection conn = DBConnector.getConnection();
        String sql = "select dg.ten, dg.sothe, s.ten from PHIEUMUON as pm "
                + " join DOCGIA as dg on pm.sothe =  dg.sothe "
                + " join SACH   as s  on s.masach = pm.masach "
                + " where pm.ngaymuon between STR_TO_DATE(?, '%d/%m/%Y') and STR_TO_DATE(?, '%d/%m/%Y');";
        // System.out.println(sql);
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, date1);
        pstmt.setString(2, date2);
        // System.out.println(pstmt);
        return pstmt.executeQuery();
    }

    public void bai8() throws SQLException, Exception {
        Connection conn = DBConnector.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "select s.ten from SACH as s  "
                + " where s.masach not in (select distinct masach from PHIEUMUON);";
        //PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery(sql);
        //ResultSet rs = pstmt.executeQuery();
        System.out.println("Ten");
        while (rs.next()) {
            System.out.println(rs.getString("ten"));
        }
    }

    public ResultSet bai9(String name) throws SQLException, Exception {
        Connection conn = DBConnector.getConnection();
        String sql = "select count(*) as 'so lan ' from PHIEUMUON as pm\n join DOCGIA as dg on dg.sothe =  pm.sothe\n join SACH as s on s.masach = pm.masach\n where dg.ten = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);

        return pstmt.executeQuery();

    }

    public void bai10() throws SQLException, Exception {
        Connection conn = DBConnector.getConnection();
        String sql = "select dg.ten ,pm.sothe from phieumuon as pm\n join DOCGIA as dg on dg.sothe =  pm.sothe\n join SACH as s on s.masach = pm.masach\n where pm.ngaytra is null";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("ten") + "," + rs.getInt("sothe"));
        }
    }
}

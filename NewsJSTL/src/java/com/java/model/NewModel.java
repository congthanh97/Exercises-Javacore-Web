package com.java.model;

import com.java.bean.Authors;
import com.java.bean.News;
import com.java.db.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NewModel {

    public final static int ROW_PER_PAGE = 2;

    private Connection conn = null;

    public NewModel() throws ClassNotFoundException, SQLException, Exception {
        this.conn = new DBConnector().getConnection();
    }

    public int count() throws Exception {
        //Connection conn = DBConnector.getConnection();
        String sql = "SELECT COUNT(*) as 'SUM' FROM news";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        int sum = 0;
        while (rs.next()) {
            sum = rs.getInt(1);
        }
        return sum;
    }

    public List<News> getAllPage(int page) throws Exception {
         List<News> listNew = new ArrayList<>();
        String sql = "select news.*, authors.name, authors.email from news join authors on news.author_id = authors.id  LIMIT ?,?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setInt(1, NewModel.ROW_PER_PAGE * (page - 1));//2*(4-1)
        pstmt.setInt(2, NewModel.ROW_PER_PAGE);
         ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            News news = new News();
            news.setId(rs.getInt("id"));
            news.setTitle(rs.getString("title"));
            news.setContent(rs.getString("content"));
            news.setSummary(rs.getString("summary"));
            news.setCreated_at(rs.getString("created_at"));
            news.setAuthors(new Authors(rs.getInt("author_id"), rs.getString("name"), rs.getString("email")));
            listNew.add(news);
        }

        return listNew;
    }

    public List<News> getNews() throws Exception {
        List<News> listNew = new ArrayList<>();
        //String sql = "select news.*, authors.name, authors.email from news join authors on news.author_id = authors.id ";
        String sql = "select * from news";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            News news = new News();
            news.setId(rs.getInt("id"));
            news.setTitle(rs.getString("title"));
            news.setContent(rs.getString("content"));
            news.setSummary(rs.getString("summary"));
            news.setCreated_at(rs.getString("created_at"));
//            news.setAuthors(new Authors(rs.getInt("author_id"), rs.getString("name"), rs.getString("email")));
            listNew.add(news);
        }

        return listNew;
    }
}

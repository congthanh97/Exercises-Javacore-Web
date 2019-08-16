
package com.java.demo.Model;

import com.java.demo.Db.Connector;
import com.java.demo.bean.Authors;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.java.demo.bean.News;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class NewsModel {
     public final static int ROW_PER_PAGE = 6;

    private Connection conn = null;

    public NewsModel() throws ClassNotFoundException, SQLException, Exception {
        this.conn = new Connector().getConnection();
    }
    
  public List<News> getNews() throws Exception {
      List<News> newsList = new ArrayList<>();
      String sql =  "select news.*, authors.name, authors.email from news join authors on news.author_id = authors.id";
      PreparedStatement pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        while (rs.next()) {
            News news = new News();
            news.setId(rs.getInt("id"));
            news.setTitle(rs.getString("title"));
            news.setSummary(rs.getString("summary"));
            news.setContent(rs.getString("content"));
            news.setAuthors(new Authors(rs.getInt("id"), rs.getString("name"), rs.getString("email")));
            news.setCreateAt(sdf.parse(rs.getString("created_at")));
            newsList.add(news);
        }
        return newsList;
  }
  
}

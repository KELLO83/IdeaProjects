package com.example.demo4;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static java.lang.Class.forName;

@WebServlet({"/cp","/CP"})
public class Connection_Pool extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
            String jdbcId = "root";
            String jdbcPw = "1234";
            Connection conn = DriverManager.getConnection(url, jdbcId, jdbcPw);
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
//            Connection conn ;
//            InitialContext ctx = new InitialContext();
//            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
//            conn =ds.getConnection();
            String query ="select * from jspdb.show";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                String depart = rs.getString("depart");
                int grade = rs.getInt("grade");
                int score = rs.getInt("score");
                out.println("id : "+id+" name : "+name+" depart : "+depart+" grade : "+grade+" score : "+score+"<br>");
                out.println("<br>");
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

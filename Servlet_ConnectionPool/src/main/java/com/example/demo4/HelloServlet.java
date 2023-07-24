package com.example.demo4;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        System.out.println("HellorServlet init 메서드가 실행되었습니다");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().append("Served at: ").append(request.getContextPath());
        PrintWriter out = response.getWriter();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
            String jdbcId ="root";
            String jdbcpw = "1234";
            Connection conn = DriverManager.getConnection(url,jdbcId,jdbcpw);
            System.out.println("success");
            Statement stmt = conn.createStatement();
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
        System.out.println("디버깅!~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>testing</title>");
        out.println("<h1>첫번쨰</h1>");
        out.println("<h2>두번째</h2>");
        out.println("<h3>third</h3>");
        out.println("</body>");
        out.println("</html>");
    }



    public void destroy() {
        System.out.println("HellorServlet destroy 메서드가 실행되었습니다");
    }
}
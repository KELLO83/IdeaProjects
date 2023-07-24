package com.example.demo4;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDAO {
    private DataSource ds;
    private Connection conn;
    private  PreparedStatement pstmt;
    private  ResultSet rs;

    private  int chage_code;
    public StudentDAO() {
        try{
            InitialContext ctx = new InitialContext();
            ds =(DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<StudentVO> getStudentList(){
        ArrayList<StudentVO> stlist = new ArrayList<StudentVO>();

        try{
            conn = ds.getConnection();


            String query = "select * from jspdb.show order by name ASC";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery(); // sql 문을실행해서 영향받은 객체 자체를 리턴ㄹ하는거고
            System.out.println("안녕하세요");

            while (rs.next()){
                StudentVO student = new StudentVO();
                student.setId(rs.getString("id"));
                student.setName(rs.getString("name"));
                student.setDepart(rs.getString("depart"));
                student.setGrade(rs.getInt("grade"));
                student.setScore(rs.getInt("score"));
                stlist.add(student);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return  stlist;
    }
    public Boolean insertStudent(StudentVO studentVO){
        try{
            conn = ds.getConnection();
            String query = "insert into jspdb.show values(?,?,?,?,?)";
            System.out.println("학생정보를 추가합니다...."+studentVO.getId()+studentVO.getName()+studentVO.getDepart());
            System.out.println("학생 grade" + studentVO.getGrade()+"학생 score" + studentVO.getScore());
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentVO.getId());
            pstmt.setString(2, studentVO.getName());
            pstmt.setString(3, studentVO.getDepart());
            pstmt.setInt(4, studentVO.getGrade());
            pstmt.setInt(5, studentVO.getScore());
            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
            return  false;
        }
        return  true;
    }
}

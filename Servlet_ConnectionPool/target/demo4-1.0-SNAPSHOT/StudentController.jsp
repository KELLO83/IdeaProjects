<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-11
  Time: 오후 4:13rg.apache.jasper.JasperException
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.example.demo4.*" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="studentDAO" class="com.example.demo4.StudentDAO"/>
<jsp:useBean id="studentVO" class="com.example.demo4.StudentVO"/>
<jsp:setProperty name="studentVO" property="*"/>

<%
    String action = request.getParameter("action"); // action is nullpointEXception
    if(action.equals("list")) {
        ArrayList<StudentVO> stlist = studentDAO.getStudentList();
        request.setAttribute("studentList", stlist);
        request.getRequestDispatcher("studentList.jsp").forward(request, response);
    }
    if(action.equals("insert")) {
        if(studentDAO.insertStudent(studentVO)) {
            out.println("<script>");
            out.println("alert('등록되었습니다.');");
            out.println("location.replace('studentController.jsp?action=list')");
            out.println("<script>");
            out.flush();
        }
    }

%>
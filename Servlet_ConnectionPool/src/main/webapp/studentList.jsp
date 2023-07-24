<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-11
  Time: 오후 4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import ="com.example.demo4.*" %>

<jsp:useBean id="studentList" class="java.util.ArrayList" scope="request"/>
<jsp:useBean id="studentDAO" class="com.example.demo4.StudentDAO"/>
<jsp:useBean id="studentVO" class="com.example.demo4.StudentVO"/>
<jsp:setProperty name="studentVO" property="*"/>
<!DOCTYPE html>
<html>
<body>
<h3 align="center">학생 정보 출력</h3>
<hr align="center" width=620 noshade>

<table class="main">
    <tr align="center">
        <td class="title1" width=90>아이디</td>
        <td class="title1" width=90>이름</td>
        <td class="title1" width=150>학과</td>
        <td class="title1" width=60>등급</td>
        <td class="title1" width=60>점수</td>
        <td class="title1" width=50>수정</td>
        <td class="title1" width=50>삭제</td>
    </tr>
    <%
        for(StudentVO st: (ArrayList<StudentVO>) studentList){
    %>
    <tr>
        <td class="content1"><%=st.getId()%></td>
        <td class="content1"><%=st.getName()%></td>
        <td class="content1"><%=st.getDepart()%></td>
        <td class="content1"><%=st.getGrade()%></td>
        <td class="content1"><%=st.getScore()%></td>
        <td class="content1">
            <a href="StudentController.jsp?action=choose%sID=<%=st.getId()%>">수정</a>
        </td>
        <td class="content1">
            <a href="StudentController.jsp?action=delte%sID=<%=st.getId()%>">삭제</a>
        </td>
    </tr>
    <%
        }
    %>
</table>
<table align=center>
    <tr>
        <td align=center>
            <input type=button value="INSERT"
                   onclick="location.replace('studentInput.jsp')">
        </td>

    </tr>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-11
  Time: 오후 4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:forward page="StudentController.jsp">
    <jsp:param value="list" name="action"/>
</jsp:forward>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-18
  Time: 오후 1:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Title</title>
</head>
<body>
<h3 align="center">학생 정보 입력</h3>
<hr align="center" width="320" noshade>

<form name="studentInput" method="post" action="StudentController.jsp">
    <input type="hidden" name="action" value="insert">
    <table class="main">
        <tr>
            <td class="title2">아이디</td>
            <td class="content2">
                <input type="text" name="id" size="10" required>
            </td>
        </tr>

        <tr>
            <td class="title2">이름</td>
            <td class="content2">
                <input type="text" name="name" size="10" required>
            </td>
        </tr>

        <tr>
            <td class="title2">학과</td>
            <td class="content2">
                <input type="text" name="depart" size="10" required>
            </td>
        </tr>

        <tr>
            <td class="title2">등급</td>
            <td class="content2">
                <input type="text" name="grade" size="5" required>
            </td>
        </tr>

        <tr>
            <td class="title2">점수</td>
            <td class="content2">
                <input type="text" name="score" size="5" required>
            </td>
        </tr>
    </table>
    <hr align="center" width="320" noshade>

    <table>
        <tr>
            <td align="left" width="200">
                <input type="submit" value="SAVE">&nbsp;
                <input type ="reset" value="CANCEL">
            </td>
            <td align="right" width="100">
            <input type="button" value="LIST"
            onClick = "location.replace('StudentController.jsp?action=list')">
            </td>
        </tr>
    </table>

</form>

</body>
</html>

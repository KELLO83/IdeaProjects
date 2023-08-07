
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name = "fileup1" method="post" action="COS" enctype="multipart/form-data">
    <table border="1" cellspacing="0" cellpadding="3">
        <tr>
            <td width="60" align="center">설명</td>
            <td width="300"><input type="text" name="comment" size="30"></td>
        </tr>
        <tr>
            <td width="60" align="center">파일 1</td>
            <td width="300"><input type="file" name="userFile1"></td>
        </tr>
        <tr>
            <td width="60" align="center">파일 2</td>
            <td width="300"><input type="file" name="userFile2"></td>
        </tr>
        <tr>
            <td width="60" align="center" colspan="2">
                <input type="submit" value="SAVE">
            </td>
        </tr>
    </table>



</form>
</body>
</html>

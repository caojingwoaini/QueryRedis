<%--
  Created by IntelliJ IDEA.
  User: caojingwoaini
  Date: 2020/11/29
  Time: 下午7:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加客户界面</title>
</head>
<body>
<form method="post" action="/customer/insert">
    客户姓名:<input type="text" name="name"><br/>
    客户性别:<input type="radio" name="gender" value="man">男
    <input type="radio" name="gender" value="woman">女 <br/>
    客户手机:<input type="text" name="telephone"><br/>
    客户地址:<input type="text" name="address"><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>

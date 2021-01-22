<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

</body>
<div style="text-align: center">
    <h2>Hello World!</h2>
    <h1>添加用户</h1>
    <form name="accountForm" action="${pageContext.request.contextPath}/user/save" method="post">
        username:<input type="text" name="username"><br>
        password:<input type="password" name="password"><br>
        <input type="submit" value="保存"><br>
    </form>
</div>

</html>

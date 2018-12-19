<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <c:forEach items="${user}" var="var">
        <tr>
            <td>
                ${var.username}
            </td>
            <td>
                ${var.age}
            </td>
        </tr>
    </c:forEach>
</table>
<form action="${pageContext.request.contextPath}/user/insertUser">
    姓名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    age:<input type="text" name="age"><br/>
    year:<input type="text" name="year"><br/>
    <input type="submit" value="保存">
</form>
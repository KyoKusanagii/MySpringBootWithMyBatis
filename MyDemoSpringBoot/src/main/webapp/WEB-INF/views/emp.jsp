<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--使用thymeleaf-->
<%--<html xmlns:th="http://www.thymeleaf.org">--%>
<html>
<head>
    <title>我的第一個SpringBoot頁面</title>
</head>
<body>
    <table border="1" cellspacing="0">
        <tr>
            <td>員工編號</td>
            <td>員工姓名</td>
            <td>員工職業</td>
            <td>員工雇用日期</td>
            <td>員工薪水</td>
        </tr>
        <c:forEach var="emp" items="${emps}">
            <tr>
                <td>${emp.empno}</td>
                <td>${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.hiredate}</td>
                <td>${emp.sal}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

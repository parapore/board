<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL式のテスト</title>
</head>
<body>

<c:forEach var="list" items="${listAttribute}">
数字：<c:out value="${list.number}"/>
文字：<c:out value="${list.moji}"/>
</c:forEach>

</body>
</html>
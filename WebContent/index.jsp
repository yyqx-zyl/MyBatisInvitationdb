<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>帖子列表页面</title>

	<link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
	<h2>帖子列表</h2>
	<form action="" method="post">
		<label>帖子标题：</label><input type="text" name="title" value=""/><button type="submit">搜索</button>
	</form>
		<table class="table table-hover">
		<tr>
			<th>编号</th>
			<th>内容摘要</th>
			<th>作者</th>
			<th>发布时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.id }</td>
				<td>${l.title }</td>
				<td>${l.summary}</td>
				<td>${l.author }</td>
				<td><fmt:formatDate value="${l.createdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td ><a href="#">查看回复</a><a href="">删除</a></td>
			</tr>
		</c:forEach>

		</table>
	</div>


</body>
</html>
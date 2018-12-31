<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BitShop Class1</title>
<style>
.menu {
}
.menu>h1 {
	padding: 5px;
	text-align: center;
}
.link {
	text-align: center;
}

.link>a {
	text-decoration: none;
}
img{
	display: block;
	margin: 0px auto;
}
</style>
</head>
<body>
	<header>
		<div class="menu" >
			<img src="<%= request.getContextPath() %>/resources/img/NYE1-19.jpg" width= 800px height=300px/>
			<h1 >메뉴</h1>
			<div class="link">
				<a href="member/main.jsp">회원관리</a> 
				<a href="">계좌관리</a> 
				<a href="">게시판</a>
				<a href="">관리자</a>
			</div>
		</div>
	</header>


</body>
</html>
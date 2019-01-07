<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 메뉴</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/resources/css/style.css" />
</head>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2" background="url()">
				<h1>Bit Shop Mall</h1>
			</td>
		</tr>
		<tr>
			<td colspan="2">

				<div id="navi-bar">
					<ul>
						<li><a href="home.do">홈</a></li>
						<li><a href="member.do">회원관리</a></li>
						<li><a href="account.do">계좌관리</a></li>
						<li><a href="article.do"><font color="green">게시판</font></a></li>
						<li><a href="admin.do">관리자</a></li>
					</ul>
				</div>
			</td>

		</tr>
		<tr style="height: 300px; width: 300px;">
			<td>
			<%@ include file="side-menu.jsp" %>
			<td>
				content
			</td>
			<tr style="width:100px">
			<td colspan="2">
			<%@ include file="../home/footer.jsp" %>
			</td>
		</tr>
	</table>

</body>
</html>
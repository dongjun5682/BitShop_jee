<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BitShop Class1</title>
<style>
.back{
	background-color: White;
	width:500px;
}

</style>
</head>
<body background="<%= request.getContextPath() %>/resources/img/image2.jpg">
	<h1>로그인</h1>
			<div class="back">
				<form action="member.do">
					ID <input type="text" name="id" /><br />
					PASS <input type="text" name="pass"/><br />
					<input type="submit" id="btn" value="로그인"/>
				</form>
		
			</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
<style>
.container{
	text-align: center;
}
fieldset{
	text-align: center;
	width:300px;
	margin: 0 auto; 
	margin-top: 30px;
}
</style>
</head>
<body>
	<div class="container">
	<h2>회원 전용 시스템</h2>
			<form action="member.do">
			<fieldset>
			<legend>MEMBER LOGIN</legend>
			<input type="text" name="id" placeholder="ID" value="dongjun"/><br />
			<input type="password" name="pass" placeholder="PASSWORD" value="1234"/><br /> 
			 <input type="hidden" name="cmd" value="login" />
			 <input type="hidden" name="dir" value="home" />
			 <input type="hidden" name="page" value="main" />
			 	<div style="margin:5px;"></div>
			 <input type="submit" id="btn" value="LOGIN" />
			</fieldset>
				<a id ="admin-link" href="#">관리자</a>
				<a id ="join-link" href="#">회원관리</a>

		</form>
	
	</div>
</body>
</html>
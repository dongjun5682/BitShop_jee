<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>

<link rel="stylesheet" href="resources/css/style.css"/>

</head>
<body>
	<div class="container">
	<h2>회원 전용 시스템</h2>
			<form action="member.do">
			<fieldset>
			<legend>MEMBER LOGIN </legend>
			<input type="text" name="uid" placeholder="ID"/><br />
			<input type="password" name="upass" placeholder="PASSWORD"/><br /> 
			 <input type="hidden" name="cmd" value="login" />
			 <input type="hidden" name="dir" value="home" />
			 <input type="hidden" name="dest" value="welcome" />
				
			 	<div style="margin:5px;"></div>
			 <input type="submit" id="btn" value="LOGIN" />
			</fieldset>
				<a id ="admin-link" href="#">관리자</a>
				<a id ="join-link" href="member.do?dest=join-form">회원가입</a>

		</form>
	
	</div>
</body>
</html>
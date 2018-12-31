<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String ssn = request.getParameter("ssn");
	String gender = "";
	String year =ssn.substring(0,2);
	String month =ssn.substring(2, 4);
	String day = ssn.substring(4, 6);
	
	String h = request.getParameter("height");
	String w = request.getParameter("weight");
	double height = Double.parseDouble(h);
	double weight = Double.parseDouble(w);
	
	double h1 = height/100;
	double re = weight /(h1 * h1);
	String bmi = "";
	
	if(re > 40){
		bmi = "고도비만입니다.";
	}else if(re >= 35){
		bmi = "2단계 비만입니다.";
	}else if(re >= 30){
		bmi = "1단계 비만입니다.";
	}else if(re >= 25){
		bmi = "과체중 입니다.";
	}else if(re > 18.5){
		bmi = "보통입니다.";
	}else {
		bmi = "저체중입니다.";
	}
	
	char ch =ssn.charAt(7);
	if(ch == '1' || ch == '3'){
		gender = "남자";
	}else if (ch == '2' || ch == '4'){
		gender = "여자";		
	}else if(ch == '5' || ch == '6'){
		gender = "외국인";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 페이지 </title>
</head>
<body>
	
	<table style="margin-left: auto; margin-right: auto;">
  <tr>
    <th>가입한 ID</th>
    <th>가입한 비밀번호 </th> 
    <th>이 름</th>
    <th>생년월일 </th>
    <th>성 별 </th> 
    <th>BMI</th>
  </tr>
  <tr>
    <td><%= id %></td>
    <td>*******</td>
    <td><%= name %></td>
    <td>19<%= year %>년 <%= month %>월 <%= day %>일</td>
    <td><%= gender %></td>
    <td><%= bmi %></td>
  </tr>
</table> <br />
	<a href="login-form.jsp">로그인으로 이동</a><br />
	<a href="main.jsp">홈으로이동</a>
</body>
</html>	
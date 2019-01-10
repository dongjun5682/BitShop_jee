<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="domain.*"%>
<div id="open-result">
	<%
			AccountBean acc = (AccountBean)request.getAttribute("account");
			String accNum = acc.getAccountNum();
			String money = String.valueOf(acc.getMoney());
			String today = acc.getToday();
					%>
	계좌번호 :
	<%= accNum %>
	<br /> 잔액 :
	<%= money %>원 <br /> 개설일자 :
	<%= today %>
</div>
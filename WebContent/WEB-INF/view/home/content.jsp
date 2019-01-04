<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="content">
	<%
		String name = request.getAttribute("name").toString();
		if (name.equals("dongjun")) {
	%>
	<%=name%>
	님 환영합니다.
	<%
		}
	%>
</div>
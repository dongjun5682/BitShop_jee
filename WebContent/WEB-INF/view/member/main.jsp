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
			<td colspan="2">
			<%@ include file="../home/header.jsp" %>
			</td>
		</tr>
		<tr>
			<td colspan="2">
		<%@ include file="../home/navi-bar.jsp" %>
			</td>

		</tr>
		<tr style="height: 300px; width: 300px;">
			<td>
			<%
			String dest = String.valueOf(request.getAttribute("dest"));
			if(dest.equals("join-from")){
				%>
				<%@ include file="side-join.jsp"	%>
				<%
			}else{
				%>
				<%@ include file="side-menu.jsp" %>
				<%
			}
			%>
			</td>
			<td>
				<%
				dest = String.valueOf(request.getAttribute("dest"));		
				switch(dest){
				case"NONE":
					%>
					<%
					break;
				case "join-form":
					%>
						<%@ include file="join-form.jsp"%>
					<%
					break;
				case "member-detail":
					%>
						<%@ include file="member-detail.jsp"%>
					<%
					break;
				case "member-update":
					%>
					<%@ include file="member_update2.jsp"%>
					<%
					break;
				}
				%>
			</td>
		</tr>
		<tr style="width:100px">
			<td colspan="2">
			<%@ include file="../home/footer.jsp" %>
			</td>
		</tr>
	</table>

</body>
</html>
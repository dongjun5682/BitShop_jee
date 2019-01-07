<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../home/head.jsp"%>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2" background="url()">
			<%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2">

				<div id="navi-bar">
					<ul>
						<li><a href="home.do">홈</a></li>
						<li><a href="member.do">회원관리</a></li>
						<li><a href="account.do"><font color="red">계좌관리</font></a></li>
						<li><a href="article.do">게시판</a></li>
						<li><a href="admin.do">관리자</a></li>
					</ul>
				</div>
			</td>

		</tr>
		<tr style="height: 300px; width: 300px;">
			<td>
			<%@ include file="side-menu.jsp" %>
			</td>
			<td>
			<%
			String cmd = request.getAttribute("cmd").toString();
			switch(cmd){
			case "move":
				%>
				<%@ include file="content.jsp" %>
				<%
				break;
			case "open-account":
				%>
				<%@ include file="open-result.jsp" %>
				<%break;
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
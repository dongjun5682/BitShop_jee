<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../home/head.jsp"%>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2" background="url()"><%@ include
					file="../home/header.jsp"%></td>
		</tr>
		<tr>
			<td colspan="2">
			<%@ include file="../home/navi-bar.jsp"%>
			</td>

		</tr>
		<tr style="height: 300px; width: 300px;">
			<td>
			<%@ include file="side-menu.jsp"%>
			</td>
			<td>
				<%
			String cmd = request.getAttribute("cmd").toString();
			switch(cmd){
			case "move":
				%> <%@ include file="content.jsp"%> <%
				break;
			case "open-account":
				%> <%@ include file="open-result.jsp"%> <%break;
			}
			%>
			</td>
		</tr>
		<tr style="width: 100px">
			<td colspan="2">
			<%@ include file="../home/footer.jsp"%>
			</td>
		</tr>
	</table>

</body>
</html>
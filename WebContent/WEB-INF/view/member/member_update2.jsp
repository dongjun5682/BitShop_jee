<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.MemberBean" %>
<div id="member-update">
<h1>비밀번호 수정</h1>
<%
MemberBean user2 = (MemberBean)session.getAttribute("user");
%>
<table>
	<tr>
		<th></th>
		<th>내용</th>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=user2.getId() %></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td>
		현재 비밀번호 <input type="text" name="currPass" /> 
		새로운 비밀번호 <input type="text" name="changePass" />
		</td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=user2.getName() %></td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><%=user2.getSsn() %></td>
	</tr>
</table>
</div>
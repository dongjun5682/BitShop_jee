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
			<td id="side-menu">
			<table>
				<tr>
					<td>계좌개설</td>
				</tr>
				<tr>
					<td>계좌목록</td>
				</tr>
				<tr>
					<td>계좌검색(이름)</td>
				</tr>
				<tr>
					<td>계좌검색(계좌번호)</td>
				</tr>
				<tr>
					<td>총계좌수</td>
				</tr>
				<tr>
					<td>계좌번호체크</td>
				</tr>
				<tr>
					<td>입금</td>
				</tr>
				<tr>
					<td>출금</td>
				</tr>
				<tr>
					<td>계좌삭제</td>
				</tr>
			</table>
			</td>
			<td>
			<div>
			<form action="account.do">
				<h1>계좌 개설</h1>
				입금색 : <input type="text" name="money" />
				<input type="hidden" name="cmd" value="open-account" />
				<input type="hidden" name="page" value="open-result" />
				<input type="submit" id="btn" value="확 인" />
			</form>
			
			</div>
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
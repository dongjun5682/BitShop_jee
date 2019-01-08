package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberBean member = null;
		System.out.println("==========멤버 서블릿으로 진입===========");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		String dir = request.getParameter("dir");
		if (dir == null) {
			dir = request.getServletPath().substring(1, request.getServletPath().indexOf("."));
		}
		String page = request.getParameter("page");
		page = (page == null) ? "main" : page;

		switch (cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upass");

			if (!(id.equals("dongjun") && pass.equals("1234"))) {
				dir = "";
				page = "index";
			}
			request.setAttribute("name", "dongjun");
			Command.move(request, response, dir, page);
			break;
		case "move":
			String dest = request.getParameter("dest");
			if (dest == null) {
				dest = "NONE";
			}
			request.setAttribute("dest", dest);
			Command.move(request, response, dir, page);
			break;
		case "join":
			member = new MemberBean();
			request.setAttribute("dest", "mypage");
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().joinMember(member);
			request.setAttribute("member", MemberServiceImpl.getInstance().findById(member.getId()));
			Command.move(request, response, dir, page);
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

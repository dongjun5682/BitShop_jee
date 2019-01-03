package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String dir = request.getParameter("dir");
		String page = request.getParameter("page");
		if(dir == null){
			dir = request.getServletPath().substring(1, request.getServletPath().indexOf("."));
		}
		if(page == null){
			page = "main";
		}
		switch ((cmd == null) ? "move" : cmd) {
		case "login":
			String id = request.getParameter("id");
			String pass =request.getParameter("pass");
		
			if(id.equals("dongjun" ) && pass.equals("1234")){
				Command.move(request, response, dir+"/"+page);
			}else{
				Command.move(request, response, "index");
			}
			break;
		case "move":
			Command.move(request, response, "member/main");
			break;
		
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==========홈 서블릿으로 진입===========");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		String dir = request.getParameter("dir");
		if (dir == null) {
			dir = request.getServletPath().substring(1, request.getServletPath().indexOf("."));
		}
		String page = request.getParameter("page");
		page = (page == null) ? "main" : page;

		switch (cmd) {
		case "move":
			request.setAttribute("name","dongjun");
			Command.move(request, response, dir,page);
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

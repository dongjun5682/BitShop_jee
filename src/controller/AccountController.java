package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AccountBean account = null;
		
		System.out.println("==========계좌 서블릿으로 진입===========");
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
			request.setAttribute("cmd", cmd);
			Command.move(request, response, dir,page);
			break;
		case "open-account":
			account = new AccountBean();
			request.setAttribute("cmd", cmd);
			String money = request.getParameter("money");
			System.out.println("입금:"+money);
			request.setAttribute("account", AccountServiceImpl.getInstance().findByAccountNum(
					AccountServiceImpl.getInstance().createAccount(Integer.parseInt(money))));
			page = "main";
			Command.move(request, response, dir, page);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

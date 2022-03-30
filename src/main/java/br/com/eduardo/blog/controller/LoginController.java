package br.com.eduardo.blog.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import br.com.eduardo.blog.model.Post;
import br.com.eduardo.blog.model.Usuario;
import br.com.eduardo.blog.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LoginService loginService = new LoginService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("./WEB-INF/login.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		Usuario usuario = new Usuario(user, pass);
		
		if(loginService.autenticar(usuario)) {			
			res.sendRedirect("/blog/post");
		} else {
			res.sendRedirect("/blog/login");
		}

	}
}

package br.com.eduardo.blog.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import br.com.eduardo.blog.persistence.PostDAO;
import br.com.eduardo.blog.model.Post;

@WebServlet(urlPatterns = {"/", "/index"})
public class ListarPostController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		PostDAO dao = new PostDAO();

		List<Post> lista = dao.listar();

		req.setAttribute("lista", lista);
		req.getRequestDispatcher("./WEB-INF/index.jsp").forward(req, resp);
	}
}

package br.com.eduardo.blog.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import br.com.eduardo.blog.persistence.PostDAO;
import br.com.eduardo.blog.model.Post;

/**
 * Servlet implementation class CreatePostController
 */
@WebServlet("/post")
public class CreatePostController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PostDAO dao = new PostDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("./WEB-INF/post.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String texto = req.getParameter("texto");
		String autor = req.getParameter("autor");
		
		Post post = new Post(titulo, texto, autor);
		
		dao.save(post);
		
		res.sendRedirect("/blog/");
	}

}

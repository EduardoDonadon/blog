package br.com.eduardo.blog.servlet;


import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/banco")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.getWriter().append(
//			"<HTML>"
//			+ "<BODY>"
//			+ "ALO MUNDO!!"
//			+ "</BODY>"
//			+ "</HTML>");
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver" );
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		resp.getWriter().append(
				"<HTML>"
				+ "<BODY>");
		
		String url = "jdbc:hsqldb:mem:mymemdb";
		String user = "SA";
		String password = "";
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url,user,password);
			resp.getWriter().append("Conectou <br>");
			System.out.println("Conectou");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		resp.getWriter().append(
				"</BODY>"
				+ "</HTML>");
	}
}

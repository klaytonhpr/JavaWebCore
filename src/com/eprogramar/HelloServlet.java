package com.eprogramar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter whiter = response.getWriter();
		// Criando o Html dinamicamnete
		
		whiter.println("<html>");
		whiter.println("<head>");
		whiter.println("<meta charset='ISO-8859-1'>");
		whiter.println("<link rel='stylesheet' type='text/css' href='JavaWebCore.css'>");
		whiter.println("</head>");
		whiter.println("<body>");
		whiter.println("<h1>Hello Servlet Java</h1>");
		whiter.println("<h2>Hello Servlet Java</h2>");
		whiter.println("<h3>Hello Servlet Java</h3>");
		whiter.println("<h4>Hello Servlet Java</h4>");
		whiter.println("<h5>Hello Servlet Java</h5>");
		whiter.println("<hr>");
		whiter.println("<h1>Hello Servlet Java</h5>");
		whiter.println("<form action='OutroServlet'>");
		whiter.println("<input type='text' name='pessoa'/>");
		whiter.println("<input type='text' name='cpf'/>");
		whiter.println("<input type='submit' name='enviar'/>");
		whiter.println("</form>");
		whiter.println("<hr>");
		whiter.println("<a href='HelloJsp.jsp'>Home</a>");
		whiter.println("</body>");
	
		whiter.println("</html>");
	}

}

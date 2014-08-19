package com.eprogramar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OutroServlet")
public class OutroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<meta charset='ISO-8859-1'>");
		writer.println("<link rel='stylesheet' type='text/css' href='JavaWebCore.css'>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Teste Segundo Servlet</h1>");
		writer.println("<p>" + request.getParameter("pessoa") + "</p>");
		writer.println("<p>" + request.getParameter("cpf") + "</p>");
		
		Enumeration<String> nomesParametros = request.getParameterNames();
		
		while (nomesParametros.hasMoreElements()) 
		{
			writer.write("<p>"+nomesParametros.nextElement().toString()+"</p>");
		}
		
		writer.println("<a href='HelloServlet'>Cadastro</a>");
		
		writer.println("</body>");
		writer.println("</html>");
		
	}

}

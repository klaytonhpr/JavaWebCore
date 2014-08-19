<%@page import="com.eprogramar.Contato"%>
<%@page import="com.eprogramar.ContatoDao"%>
<%@page import="com.sun.org.apache.xpath.internal.axes.IteratorPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="JavaWebCore.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Meu Primeiro Jsp</title>
</head>
<body>

<%
   String nomeString = "Hello Jsp";
%>
<h1><%=nomeString%></h1>
<br>

<% 
	List<String> lista = new ArrayList<String>();
		
	for(int i = 1; i<=10; i++)
	{
		lista.add("Elemento: "+i);
	}

%>

<ul>
	<%for(String iten : lista){%>
	<li>
	
	<%=iten%>
	
	</li>
	
	<%}%>
</ul>


<% ContatoDao dao = new ContatoDao(); %>


<table border="1">
<thead>
<tr>
	<th>Nome</th><th>Email</th><th>Telefone</th><th>Endereco</th>
</tr>
</thead>

	<% for(Contato iten: dao.getLista()){ %> 
	<tr>
	
	<td><%=iten.nome%></td>
	<td><%=iten.email%></td>
	<td><%=iten.telefone%></td>
	<td><%=iten.endereco%></td>
	
	</tr>
	<% } %>

</table>
<br>

<a href="HelloServlet">Cadastro</a>

</body>
</html>
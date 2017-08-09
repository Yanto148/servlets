package com.realdolmen.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/person")
public class PersonController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PersonService ps = new PersonService();
		Person p = ps.findById(1507);
		
		req.setAttribute("myPerson", p);
		
		req.getRequestDispatcher("/WEB-INF/person.jsp").forward(req, resp); 	//Anything is WEB-INF folder is private, so you cannot surf to /person.jsp anymore
	}
}

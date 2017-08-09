package com.realdolmen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello.html")	//Slash niet vergeten, dit is anders dan in de JSP
public class RunnerServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    	PrintWriter writer = resp.getWriter();
    	resp.setContentType("text/html");
    	writer.println("<!DOCTYPE html><html lang='en'>");
    	writer.println("<head><meta charset=\"UTF-8\"><title>Hello</title></head>");
    	writer.println("<body><form METHOD='POST' ACTION='/servlets/hello.html'>"); //Action niet verplicht want stuurt toch naar deze servlet
    	writer.println("<div>");
    	writer.println("First name: <input type='text' name='firstname' id='firstname'>");
    	writer.println("</div>");
    	writer.println("<div>");
    	writer.println("Last name: <input type='text' name='lastname' id='lastname'>");
    	writer.println("</div>");
    	writer.println("<div>");
    	writer.println("Age: <input type='text' name='age' id='age'>");
    	writer.println("</div>");
    	writer.println("<input type='submit' value='Verzenden'>");
    	writer.println("</form>");
    	writer.println("</body></html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String firstName = req.getParameter("firstname");
    	String lastName = req.getParameter("lastname");
    	String age = req.getParameter("age");
    	    	
    	if (firstName == "" || lastName == "" || age == "")
    	{
    		resp.sendError(406, "Niet alle velden ingevuld");
    	}
    	
    	else 
    	{
    		PrintWriter writer = resp.getWriter();
        	writer.println("<div>");
        	writer.println("Voornaam: " +  firstName);
        	writer.println("</div>");
        	writer.println("<div>");
        	writer.println("Achternaam: " +  lastName);
        	writer.println("</div>");
        	writer.println("<div>");
        	writer.println("Leeftijd: " +  age);
        	writer.println("</div>");
    	}
    }
}
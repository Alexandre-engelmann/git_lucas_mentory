package com.ibm.calculator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class String_operation
 */
@WebServlet("/String_operation")
public class String_operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String input_text;
	private String input_type;
	private String input_result;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		input_text = request.getParameter("textfield_name");
		input_type = request.getParameter("st_front");
		System.out.println("input_text" + input_text);
		System.out.println("input_type" + input_type);
		if(input_type.equalsIgnoreCase("lowercase"))
			input_result= input_text.toLowerCase();
		else if (input_type.equalsIgnoreCase("uppercase"))
			input_result= input_text.toUpperCase();
		else if (input_type.equalsIgnoreCase("backwards")) {
	        StringBuilder input1 = new StringBuilder(); 
	        input1.append(input_text); 
	        input1 = input1.reverse(); 
	        System.out.println(input1);
	        input_result=input1.toString();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/show_string.jsp");
		request.setAttribute("result", String.valueOf(input_result));
		rd.forward(request, response);

	}


}

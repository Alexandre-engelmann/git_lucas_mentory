package com.ibm.calculator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Mentorizašao Luquetes on 19 december 2019 around 15:00
//after we ate panetone on stick
/**
 * Servlet implementation class Operation
 */
@WebServlet("/Operation")
public class Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private double number1;
	private double number2;
	private double result;
	private String operacao;
	private String string_front;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		number1 = Double.valueOf(request.getParameter("firstnumber"));
		number2 = Double.valueOf(request.getParameter("lastnumber"));
		operacao = request.getParameter("Operacao");
		if (operacao.equals ("soma"))
			result = number1+number2;
		else if (operacao.equals ("subtracao"))
			result = number1-number2;
		else if (operacao.equals ("divisao"))
			result = number1/number2;
		else if (operacao.equals ("multiplicacao"))
			result = number1*number2;
		System.out.println("Resultado da soma = "+ String.valueOf(result));
		RequestDispatcher rd = request.getRequestDispatcher("/show_index.jsp");
		request.setAttribute("result", String.valueOf(result));
		rd.forward(request, response);
		string_front = request.getParameter("Operacao");

	}

}
//Tasks
//Mentorizašao Luquetes on 19 december 2019 around 17:52
//campo para escrever Lucas
//3 radio buttons
//Maiusculo
//Minusculo
//Tras para frente

//Transf JAVA (button)
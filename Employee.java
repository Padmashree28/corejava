package com.deloitte;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		double bonus=0.0,netsal=0.0;
		String name=request.getParameter("empname");
		int sal=Integer.parseInt(request.getParameter("sal"));
		String grade=request.getParameter("grade");
		int tax=25*sal/100;
		
		if(sal>100000 && grade.equals("A")) {
		 bonus=5*10/100.0;
			 netsal=sal+bonus-tax;
		pw.println("The bonus is:" +bonus);
		pw.println("The netsal is:" +netsal);
		
		}
		else if(sal>50000 && sal<=100000 &&  grade.equals("B")) {
			 bonus=7*10/100;
			 netsal=sal+bonus-tax;
			
		pw.println("The bonus is:" +bonus);
		pw.println("The netsal is:" +netsal);
	}
		else if(sal<50000 &&  grade.equals("C")) {
			 bonus=20*10/100;
			 netsal=sal+bonus-tax;
		pw.println("The bonus is:" +bonus);
		pw.println("The netsal is:" +netsal);
	}
		
		pw.println("The tax is: " +tax);
		//PrintWriter pw=response.getWriter();
		String str1="<table border=1>"+
		           "<tr><th>Empname</th>" +
		           "<th>Sal</th>" +
		           "<th>Bonus</th>" +
		           "<th>Tax</th>" +
		           "<th>Netsal</th>" +
		           "</tr>";
		           
		String str2="<table border=1>"+
		           "<td>"+name+"</td>" +
		           "<td>"+sal+"</td>" +
		           "<td>"+bonus+"</td>" +
		           "<th>"+tax+"</td>" +
		           "<td>"+netsal+"</td>" +
		           "</table>";
		pw.println(str1+str2);
		           
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

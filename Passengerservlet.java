package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Passengerservlet
 */
public class Passengerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Passengerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String des=request.getParameter("des");
		DBHelper db=new DBHelper();
		ArrayList passengerslist=db.getallpassenger(des);
		String str1="<table border=1>" +
		            "<tr>" +
				    "<th>Firstname</th>" +
		            "<th>lastname</th>" +
				    "<th>source</th>" +
		            "<th>Destination</th>" +
				    "<th>Gender</th>" +
		            "</tr>";
		pw.println(str1);
		
		            
		for(int i=0;i<passengerslist.size();i++) {
			PassengerVO pvo=(PassengerVO)passengerslist.get(i);
			String str2="<tr>" +
			"<td>"+pvo.getFirstname()+"</td>" +
			"<td>"+pvo.getLastname()+"</td>" +
			"<td>"+pvo.getSource()+"</td>" +
			"<td>"+pvo.getDes()+"</td>" +
			"<td>"+pvo.getGender()+"</td>" +
		  "</tr>";
			pw.println(str2);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.Crud;
import com.google.gson.Gson;
import com.pojo.Invoices;

/**
 * Servlet implementation class Fetch
 */
@WebServlet("/Fetch")
public class Fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Fetch() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		 response.getWriter().append("Served at: ").append(request.getContextPath());
		 Crud fetchdata=new Crud();
		 
		 HashMap<Object, Object> Response = new HashMap<Object, Object>();
		 ArrayList<Invoices> data = fetchdata.getData();
		 //System.out.println(data);
		 Response.put("invoices", data);
		  
		 Gson gson = new Gson();
		 String respData = gson.toJson(Response);
		 response.setHeader("Access-Control-Allow-Origin", "*");
		 response.getWriter().append(respData);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
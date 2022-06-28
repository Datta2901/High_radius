package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;

import com.pojo.Invoices;

public class Crud {

	public Connection getConnection()
	{
		 Connection conn =null;
		 String url ="jdbc:mysql://localhost:3306/grey_goose?zeroDateTimeBehavior=convertToNull";
		 String user = "root";
		 String pass ="manikanta";
					
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;

		}
	
		public ArrayList<Invoices> getData()
		{
			ArrayList<Invoices> ALLInvoices =new ArrayList<Invoices>();
			String business_code;
			int cust_number;
//			String name_customer;
			Date clear_date;
			int buisness_year;
			String doc_id;
			Date posting_date;
			Date document_create_date;
			Date document_create_date1;
			Date due_in_date;
			String invoice_currency;
			String document_type;
			int posting_id;
			String area_business;
			double total_open_amount;
			Date baseline_create_date;
			String cust_payment_terms;
			int invoice_id;
			byte isOpen;
			String aging_bucket;
			byte is_deleted;
			try {
			 Connection conn = getConnection();
			 String sql_query="SELECT * from winter_internship";
			 PreparedStatement pst = conn.prepareStatement(sql_query);
			 //System.out.println(pst);
			 
			 ResultSet rs = pst.executeQuery();
			 
			 while(rs.next())
			 {
					business_code = rs.getString("business_code");
					cust_number = rs.getInt("cust_number");
//					name_customer = rs.getString("name_customer");
					clear_date = rs.getDate("clear_date");
					buisness_year = rs.getInt("buisness_year");
					doc_id = rs.getString("doc_id");
					posting_date = rs.getDate("posting_date");
					document_create_date = rs.getDate("document_create_date");
					document_create_date1 = rs.getDate("document_create_date1");
					due_in_date = rs.getDate("due_in_date");
					invoice_currency = rs.getString("invoice_currency");
					document_type = rs.getString("document_type");
					posting_id = rs.getInt("posting_id");
					area_business = rs.getString("area_business");
					total_open_amount = rs.getDouble("total_open_amount");
					baseline_create_date = rs.getDate("baseline_create_date");
					cust_payment_terms = rs.getString("cust_payment_terms");
					invoice_id = rs.getInt("invoice_id");
					isOpen = rs.getByte("isOpen");
					aging_bucket = rs.getString("aging_bucket");
					is_deleted = rs.getByte("is_deleted");
					
					Invoices invoice = new Invoices(business_code, cust_number, clear_date, buisness_year, doc_id,
							posting_date, document_create_date, document_create_date1, due_in_date,
							invoice_currency, document_type, posting_id, area_business,
							total_open_amount, baseline_create_date, cust_payment_terms, invoice_id, isOpen,
							aging_bucket, is_deleted);	
					
					//System.out.println("ID is "+id+" "+"Name is "+Name);
					
//					s.setBusiness_code(business_code);
//					s.setCust_number(cust_number);
////					s.setName_customer(name_customer);
//					s.setClear_date(clear_date);
//					s.setBuisness_year(buisness_year);
//					s.setDoc_id(doc_id);
//					s.setPosting_date(posting_date);
//					s.setDocument_create_date(document_create_date);
//					s.setDocument_create_date1(document_create_date1);
//					s.setDue_in_date(due_in_date);
//					s.setInvoice_currency(invoice_currency);
//					s.setDocument_type(document_type);
//					s.setPosting_id(posting_id);
//					s.setArea_business(area_business);
//					s.setTotal_open_amount(total_open_amount);
//					s.setBaseline_create_date(baseline_create_date);
//					s.setCust_payment_terms(cust_payment_terms);
//					s.setInvoice_id(invoice_id);
//					s.setIsOpen(isOpen);
//					s.setAging_bucket(aging_bucket);
//					s.setIs_deleted(is_deleted);
					
					
					ALLInvoices.add(invoice);
					
					
			 }
			 
			 
			 for(Invoices stud: ALLInvoices)
			 {
				 System.out.println(stud.toString());
			 }
			 
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("exception occur");
			}
			
			return ALLInvoices;
		}
}
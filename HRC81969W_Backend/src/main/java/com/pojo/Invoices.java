package com.pojo;
import java.sql.Date;

public class Invoices {
	private String business_code;
	private int cust_number;
	private Date clear_date;
	private int buisness_year;
	private String doc_id;
	private Date posting_date;
	private Date document_create_date;
	private Date document_create_date1;
	private Date due_in_date;
	private String invoice_currency;
	private String document_type;
	private int posting_id;
	private String area_business;
	private double total_open_amount;
	private Date baseline_create_date;
	private String cust_payment_terms;
	private int invoice_id;
	private byte isOpen;
	private String aging_bucket;
	private byte is_deleted;
	
	
	
	public String getBusiness_code() {
		return business_code;
	}



	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}



	public int getBust_number() {
		return cust_number;
	}



	public void setBust_number(int bust_number) {
		this.cust_number = bust_number;
	}



	public Date getClear_date() {
		return clear_date;
	}



	public void setClear_date(Date clear_date) {
		this.clear_date = clear_date;
	}



	public int getBuisness_year() {
		return buisness_year;
	}



	public void setBuisness_year(int buisness_year) {
		this.buisness_year = buisness_year;
	}



	public String getDoc_id() {
		return doc_id;
	}



	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}



	public Date getPosting_date() {
		return posting_date;
	}



	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}



	public Date getDocument_create_date() {
		return document_create_date;
	}



	public void setDocument_create_date(Date document_create_date) {
		this.document_create_date = document_create_date;
	}



	public Date getDocument_create_date1() {
		return document_create_date1;
	}



	public void setDocument_create_date1(Date document_create_date1) {
		this.document_create_date1 = document_create_date1;
	}



	public Date getDue_in_date() {
		return due_in_date;
	}



	public void setDue_in_date(Date due_in_date) {
		this.due_in_date = due_in_date;
	}



	public String getInvoice_currency() {
		return invoice_currency;
	}



	public void setInvoice_currency(String invoice_currency) {
		this.invoice_currency = invoice_currency;
	}



	public String getDocument_type() {
		return document_type;
	}



	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}



	public int getPosting_id() {
		return posting_id;
	}



	public void setPosting_id(int posting_id) {
		this.posting_id = posting_id;
	}



	public String getArea_business() {
		return area_business;
	}



	public void setArea_business(String area_business) {
		this.area_business = area_business;
	}



	public double getTotal_open_amount() {
		return total_open_amount;
	}



	public void setTotal_open_amount(double total_open_amount) {
		this.total_open_amount = total_open_amount;
	}



	public Date getBaseline_create_date() {
		return baseline_create_date;
	}



	public void setBaseline_create_date(Date baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}



	public String getCust_payment_terms() {
		return cust_payment_terms;
	}



	public void setCust_payment_terms(String cust_payment_terms) {
		this.cust_payment_terms = cust_payment_terms;
	}



	public int getInvoice_id() {
		return invoice_id;
	}



	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}



	public byte getIsOpen() {
		return isOpen;
	}



	public void setIsOpen(byte isOpen) {
		this.isOpen = isOpen;
	}



	public String getAging_bucket() {
		return aging_bucket;
	}



	public void setAging_bucket(String aging_bucket) {
		this.aging_bucket = aging_bucket;
	}



	public byte getIs_deleted() {
		return is_deleted;
	}



	public void setIs_deleted(byte is_deleted) {
		this.is_deleted = is_deleted;
	}



	public Invoices(String business_code, int cust_number, Date clear_date, int buisness_year, String doc_id,
			Date posting_date, Date document_create_date, Date document_create_date1, Date due_in_date,
			String invoice_currency, String document_type, int posting_id, String area_business,
			double total_open_amount, Date baseline_create_date, String cust_payment_terms, int invoice_id, byte isOpen,
			String aging_bucket, byte is_deleted) {
		super();
		this.business_code = business_code;
		this.cust_number = cust_number;
		this.clear_date = clear_date;
		this.buisness_year = buisness_year;
		this.doc_id = doc_id;
		this.posting_date = posting_date;
		this.document_create_date = document_create_date;
		this.document_create_date1 = document_create_date1;
		this.due_in_date = due_in_date;
		this.invoice_currency = invoice_currency;
		this.document_type = document_type;
		this.posting_id = posting_id;
		this.area_business = area_business;
		this.total_open_amount = total_open_amount;
		this.baseline_create_date = baseline_create_date;
		this.cust_payment_terms = cust_payment_terms;
		this.invoice_id = invoice_id;
		this.isOpen = isOpen;
		this.aging_bucket = aging_bucket;
		this.is_deleted = is_deleted;
	}
	
	
//	@Override
//	public String toString() {
//		return "Invoices [Business_code=" + Business_code + ", Cust_number=" + Cust_number  + ", Clear_date=" + Clear_date
//				+ ", Buisness_year=" + Buisness_year + ", Doc_id=" + Doc_id +  ", Posting_date=" + Posting_date + ", Document_create_date=" + Document_create_date
//				+ ", Document_create_date1=" + Document_create_date1 + ", Due_in_date=" + Due_in_date + ", Invoice_currency=" + Invoice_currency
//				+ ", Document_type=" + Document_type + ", Posting_id=" + Posting_id + ", Area_business=" + Area_business + ", Total_open_amount="
//				+ Total_open_amount + ", Baseline_create_date=" + Baseline_create_date + ", Cust_payment_terms=" + Cust_payment_terms
//				+ ", Invoice_id=" + Invoice_id + ", IsOpen=" + IsOpen + ", Aging_bucket=" + Aging_bucket + ", Is_deleted=" + Is_deleted + "]";
//	}
	
}
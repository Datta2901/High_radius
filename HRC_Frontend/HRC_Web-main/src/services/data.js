import axios from "axios";

export const getData = async () => {
    let response = await axios.post("http://localhost:8080/hrc80147w/Fetch");
    let data = response.data.invoices;
    data.map((invoice, index) => ({...invoice, "id":index}));
    return data;
}

export const addInvoice = async ({business_code, cust_number, clear_date, buisness_year, doc_id,
    posting_date, document_create_date, due_in_date,
    invoice_currency, document_type, posting_id, 
    total_open_amount, baseline_create_date, cust_payment_terms, invoice_id, }) => {
    let data = "business_code" + business_code + "&cust_number" + cust_number +
                "&clear_date" + clear_date + "&buisness_year" + buisness_year +
                "&posting_date" + posting_date + "&document_create_date" + document_create_date +  "&due_in_date" + due_in_date +
                "&invoice_currency" + invoice_currency + "&document_type" + document_type + 
                "&posting_id" + posting_id +  "&total_open_amount" + total_open_amount + "&baseline_create_date" + baseline_create_date + 
                "&cust_payment_terms" + cust_payment_terms + "&invoice_id" + invoice_id;
    let response = await axios.get("backend/addInvoice?" + data); 

}
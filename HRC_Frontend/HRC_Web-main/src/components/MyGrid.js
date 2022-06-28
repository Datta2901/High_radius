// import { Grid, Box, CssBaseline, TableContainer, Table, TableRow, TableCell, TableBody, TableHead, Paper } from "@mui/material";
import { DataGrid, GridColDef, GridValueGetterParams } from '@mui/x-data-grid';
import { useEffect, useState } from "react";
import { getData } from "../services/data"; 
import AddInvoice from "./AddInvoice";
import { style } from "@mui/system";
import React from "react";

const columns = [
  {field: 'business_code',headerName: 'Business Code',width: 165 , height:100 , align: 'center', headerAlign:'center'},
  {field: 'cust_number',headerName: 'Customer Number',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'clear_date',headerName: 'Clear Date',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'buisness_year',headerName: 'Buisness Year',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'doc_id',headerName: 'Document Id',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'posting_date',headerName: 'Posting Date',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'document_create_date',headerName: 'Document Create Date',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'due_in_date',headerName: 'Due Date',width: 165 , height:100, align: 'center', headerAlign:'center'},
  {field: 'invoice_currency',headerName: 'Invoice Currency',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'document_type',headerName: 'Document Type',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'posting_id',headerName: 'Posting Id',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'total_open_amount',headerName: 'Total Open Amount',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'baseline_create_date',headerName: 'Baseline Create Date',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'cust_payment_terms',headerName: 'Customer Payment Terms',width: 165, height:100 , align: 'center', headerAlign:'center'},
  {field: 'invoice_id',headerName: 'Invoice id',width: 165, height:100 , align: 'center', headerAlign:'center' }
]

export default function MyGrid() {
    const [data, setData] = useState([]);
    const [invoice, setInvoice] = useState({business_code:'', cust_number:'', clear_date:'', buisness_year:'', doc_id:'',
      posting_date:'', document_create_date:'',  due_in_date:'',
      invoice_currency:'', document_type:'', posting_id:'', 
      total_open_amount:'', baseline_create_date:'', cust_payment_terms:'', invoice_id:'' });
    
    const {business_code, cust_number, clear_date, buisness_year, doc_id,
      posting_date, document_create_date,  due_in_date,
      invoice_currency, document_type, posting_id, 
      total_open_amount, baseline_create_date, cust_payment_terms, invoice_id} = invoice;
      const [selected ,setSelected] = useState([]);
  const [pageSize,setPageSize] = React.useState(5);
  
    
    const changeHandler = (e) => {
      const { name, value } = e.target;
      setInvoice({ ...invoice, [name]: value })
    }
    const submitHandler = (event) => {
      event.preventDefault();
      window.alert("Submitted");
    }

    useEffect(async () => { 
        setData(await getData())
    }, []);

    // console.log(data)

    return (
      <>
       
        <br />

        <div  style={{ height: 400, width: '100%' , backgroundColor: "#11202A" , color: "white"}}>
          <DataGrid
            rows={data}
            columns={columns}
            getRowId={(row) => row.doc_id}
            pageSize={pageSize}
            onPageSizeChange = {(newPageSize) => setPageSize(newPageSize)}
            rowsPerPageOptions={[5,10,15,20,25]}
            pagination
            checkboxSelection
            onStateChange={(e) => setSelected(e.setSelected)}
            density='compact'
            disableColumnMenu={true}
            sx={{color:'white'}}
          />
        </div>
      </>
    );
}
import React, { useState } from "react";
import Button from "@mui/material/Button";
import Modal from "@mui/material/Modal";
import Box from "@mui/material/Box";
import Grid from "@mui/material/Grid";
import TextField from '@mui/material/TextField';
import './AddInvoice.css'


export default function AddInvoice(business_code, cust_number, clear_date, buisness_year, doc_id,
  posting_date, document_create_date, due_in_date,
  invoice_currency, document_type, posting_id,
  total_open_amount, baseline_create_date, cust_payment_terms, invoice_id, isOpen, changeHandler, submitHandler)
  {
  const [open, setOpen] = useState(false);
  const handleOpen = () => setOpen(true);
  const handleClose = () => setOpen(false);

  return (
    <div > 
      <Button variant="outlined" onClick={handleOpen}>
        Add
      </Button>
      <Modal
        open={open}
        onClose={handleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box className="modal addgrid"component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '118ch' },
      }}
      noValidate
      autoComplete="off"
    >
          <h2>ADD</h2><br />
          <div>
            <Grid
              container
              rowSpacing={2.5}
              columnSpacing={{ xs: 1, sm: 2, md: 3 }}
              containerspacing={{ xs: 2, md: 3 }}
            >
               <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="business_code" variant="outlined" onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="cust_number" variant="outlined"  onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="clear_date" variant="outlined" type='date' value={clear_date} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="business_year" variant="outlined" value={buisness_year} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="doc_id" variant="outlined" value={doc_id} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="posting_date" variant="outlined" type='date' value={posting_date} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="due_in_date" variant="outlined" type='date' value={due_in_date} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="invoice_currency" variant="outlined" value={invoice_currency} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="document_type" variant="outlined" value={document_type} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="posting_id" variant="outlined" value={posting_id} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="total_open_amount" variant="outlined" value={total_open_amount} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="baseline_create_date" variant="outlined" value={baseline_create_date} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}>
                <div><TextField id="outlined-basic" label="cust_payment_terms" variant="outlined" value={cust_payment_terms} onChange={changeHandler} /></div>
              </Grid>
              <Grid item xs={3}> 
                <div><TextField id="outlined-basic" label="invoice_id" variant="outlined" value={invoice_id} onChange={changeHandler} /></div>
                </Grid>
                <Grid item xs={3}> 
                <div> <TextField id="outlined-basic" label="isOpen" variant="outlined" value={isOpen} onChange={changeHandler} /></div>
                </Grid>
            </Grid>
          </div>

          <div className="modal-actions">
          <Button variant="outlined">ADD</Button>
            <Button variant="outlined" onClick={handleClose}>
              Cancel
            </Button>
            
          </div>
        </Box>
      </Modal>
    </div>
  );
}

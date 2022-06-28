import React, { useState } from "react";
import ToggleButton from "@mui/material/ToggleButton";
import ToggleButtonGroup from "@mui/material/ToggleButtonGroup";
import TextField from "@mui/material/TextField";
import Stack from "@mui/material/Stack";
import Button from "@mui/material/Button";
import Delete from "./Delete";
import "./Actions.css";
import { Refresh } from '@mui/icons-material';

import AddInvoice from "./AddInvoice";

function Actions() {
  const [alignment, setAlignment] = useState("predict");

  const handleChange = (event, newAlignment) => {
    setAlignment(newAlignment);
  };
  return (
    < div className="actions">
     
      
      <div className="toggle">
        <ToggleButtonGroup
          color="primary"
          value={alignment}
          exclusive
          onChange={handleChange}
          size="small"
        >
          <ToggleButton value="predict" color="primary">Predict</ToggleButton>
          <ToggleButton value="analytics-view">Analytics View</ToggleButton>
          <ToggleButton value="advance-search">Advance Search</ToggleButton>
        </ToggleButtonGroup>
      </div>
      <div>
        <ToggleButton className="refresh" startIcon={Refresh} ></ToggleButton>
      </div>
      <div>
        <TextField
          id="outlined-basic"
          label="Search Customer Id"
          variant="outlined"
          size="small"
        />
      </div>
      <div>
        <Stack spacing={2} direction="row">
          <AddInvoice />
          <Button variant="text">Edit</Button>
          <Delete />
        </Stack>
      </div>
    </div>
  );
}

export default Actions;

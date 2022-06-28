import React from "react";
import "./Header.css";

import GroupLogo from '../assets/Group 20399.svg';
import CompanyLogo from '../assets/logo.svg';

function Header() {
  return (
    <>
  <div className="header">
      <div className='logo1'>
        <img src={GroupLogo} alt="ABC" />
    </div>
    <div className='logo'>
        <img src={CompanyLogo} alt="HighRadius" />
    </div>
</div>

  <div className='invoice'>
    <p>Invoice List</p>
  </div>




  </>
  );
}

export default Header;

import React from "react";
import Header from "./components/Header";
import Actions from "./components/Actions";
import MyGrid from "./components/MyGrid";
import Footer from "./components/footer";

import "./App.css";

function App() {
  return (
    <div className="App">
      <Header />
      <Actions />
      <MyGrid/>
      <Footer />
    </div>
  );
}

export default App;

import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Login from './Screens/Login/Login'
import Signup from './Screens/Signup/Signup'
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { UserManagement } from './Screens/RoleManagement/UserManagement'

function App() {

  return (
    <>

      <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login/>}>
        <Route path="signup" element={<Signup/>} />
        </Route>
      </Routes>
      
      </BrowserRouter>

        {/* <UserManagement></UserManagement> */}
    </>
  )
}

export default App

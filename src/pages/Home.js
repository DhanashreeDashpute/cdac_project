import React ,{Fragment}from 'react'
//import { TopNavbar } from '../Component/Header/TopNavbar'
import { Footer } from '../Component/Footer/Footer'
import { HeaderSlider } from '../Slider/HeaderSlider'
import { AllCategories } from '../Component/Categories/AllCategories'
//import { Link } from 'react-router-dom';
export const Home = () => {
  return (
    <Fragment>
        
        <HeaderSlider/>
        <AllCategories/>
        <div className="mb-5 pb-5"></div>
        <div className="mb-5 pb-5"></div>
       
        <Footer/>
    </Fragment>
  )
}
 
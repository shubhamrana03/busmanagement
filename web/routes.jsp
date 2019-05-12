<%-- 
    Document   : routes
    Created on : 16 Apr, 2019, 10:54:55 AM
    Author     : shubhamrana
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminDash</title>
<style>
    table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>




<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="css/css1.css">
<script type = "text/javascript" src= "js/dashboard.js" ></script> 
<link rel="stylesheet" href="css/css2.css">
	<script src="https://use.fontawesome.com/07b0ce5d10.js"></script>
  
    <style>
    p{
    color:#c23616;
    }
    h4
		{
			float: right;
			color: crimson;
			font-family: Segoe Print;
			background-color: white;
			border-radius: 20px;
			padding: 10px;
		}
    h4:hover
		{
			color: black;
			cursor: default;
		}
    </style>
    </head>
   

    
    	
            	
    <div class="page-topbar">
       	
       	
       <div class="logo-area">   
        <img src="image1/d1.jpg" length="70" width="70">
       </div> 
 
        <div class="quick-area">
        
            	
        <ul class="pull-left info-menu  user-notify">
       
        
         <li><a href="messages.html"> <i class="fa fa-envelope"></i> <span class="badge"></span></a></li>
         <li><a href="notify.html"> <i class="fa fa-bell"></i> <span class="badge"></span></a></li>  
         
       
              </ul>
         
           
       <ul class="pull-right info-menu user-info">
      
         <li class="profile">
             <a href="#" data-toggle="dropdown" class="toggle" aria-expanded="false">
<!--                 <img src="images/lock.png" class="img-circle img-inline">-->
                 <% String name = (String)request.getAttribute("uname"); %>
<!--    <p align="right">Welcome ! -->
<!--                 <span><%=name%>!<i class="fa fa-angle-down"></i></span>-->
             </a>
            
<!--             <ul class="dropdown-menu profile fadeIn ">
                        <li>
                            <a href="setting.html">
                                <i class="fa fa-wrench"></i>
                                Settings
                            </a>
                        </li>
                        <li>
                            <a href="profile.html">
                                <i class="fa fa-user"></i>
                                Profile
                            </a>
                        </li>
                        
                        <li class="last">
                            <a href="logout.jsp">
                                <i class="fa fa-lock"></i>
                                Sign Out
                            </a>
                        </li>
                    </ul>
           -->
            
           </li>
         </ul>
            
    </div>
    </div>
    
   
    <div class="page-sidebar expandit">
      <div class="sidebar-inner" id="main-menu-wrapper">
         <div class="profile-info row ">
           <div class="profile-image ">
                <a href="ui-profile.html">
                </a>
            </div>
             <div class="profile-details">
                <h3>
                    <a href="ui-profile.html"><h4><%=name%>!</h4></a> 
                </h3>
                

            </div>
          </div>


          <ul class="wraplist" style="height: auto;">	
<!--          <li class="menusection">Main</li>-->
        <li><a href="mainpage.jsp"><span class="sidebar-icon"><i class="fa fa-vcard"></i></span> <span class="menu-title">DashBoard</span></a></li>
  
          <li><a href="routes.jsp"><span class="sidebar-icon"><i class="fa fa-vcard"></i></span> <span class="menu-title">Routes</span></a></li>

          
           <li><a href="businfo.jsp"><span class="sidebar-icon"><i class="fa fa-cutlery"></i></span> <span class="menu-title">Bus Information</span></a></li>
         
         
          
          </ul>
        </div>
    </div>
    
    
    
      <section id="main-content">
     <section class="wrapper main-wrapper row">        
          <div class="col-md-30">              
              <section class="box">
    
                  <h2>Panchkula</h2>
                  
                  
                  <table>
  <tr>
    <th>Time</th>
    <th>From</th>
    <th>To</th>
  </tr>
  <tr>
    <td>7:35 AM</td>
    <td>Sector 20</td>
    <td>Sector 25-26</td>
  </tr>
  <tr>
    <td>7:50 AM</td>
    <td>Sector 25-26</td>
    <td>Amartex</td>
  </tr>
  <tr>
    <td>7:55 AM</td>
    <td>Amartex</td>
    <td>Sector 11-14-15-10</td>
  </tr>
  <tr>
    <td>8:00 AM</td>
    <td>Sector 11-14-15-10</td>
    <td>Sector 4</td>
  </tr>
  <tr>
    <td>8:10 AM</td>
    <td>Sector 4</td>
    <td>Tank Chowk</td>
  </tr>
  <tr>
    <td>8:15 AM</td>
    <td>Tank Chowk</td>
    <td>Old Panchkula</td>
  </tr>
  <tr>
    <td>8:25 AM</td>
    <td>Old Panchkula</td>
    <td>Pinjore</td>
  </tr>
  <tr>
    <td>8:45 AM</td>
    <td>Pinjore</td>
    <td>University Campus</td>
  </tr>
</table>

    <h2>Chandigarh</h2>
    
    <table>
  <tr>
    <th>Time</th>
    <th>From</th>
    <th>To</th>
  </tr>
  <tr>
    <td>7:35 AM</td>
    <td>Sector 43</td>
    <td>Sector 48</td>
  </tr>
  <tr>
    <td>7:45 AM</td>
    <td>Sector 48</td>
    <td>Sector 35</td>
  </tr>
  <tr>
    <td>7:55 AM</td>
    <td>Sector 35</td>
    <td>Sector 17</td>
  </tr>
  <tr>
    <td>8:05 AM</td>
    <td>Sector 17</td>
    <td>Sector 7</td>
  </tr>
  <tr>
    <td>8:10 AM</td>
    <td>Sector 7</td>
    <td>Sector 26 Mandi</td>
  </tr>
  <tr>
    <td>8:25 AM</td>
    <td>Sector 26 Mandi</td>
    <td>Old Panchkula</td>
  </tr>
  <tr>
    <td>8:45 AM</td>
    <td>Old Panchkula</td>
    <td>University Campus</td>
  </tr>
</table>

    
    
    <h2>Nalagarh</h2>
    
    
    
    <table>
  <tr>
    <th>Time</th>
    <th>From</th>
    <th>To</th>
  </tr>
  <tr>
    <td>7:30 AM</td>
    <td>Bharatgarh</td>
    <td>Nalagarh</td>
  </tr>
  <tr>
    <td>7:55 AM</td>
    <td>Nalagarh</td>
    <td>Baddi</td>
  </tr>
  <tr>
    <td>8:10 AM</td>
    <td>Baddi</td>
    <td>Barotiwala</td>
  </tr>
  <tr>
    <td>8:30 AM</td>
    <td>Barotiwala</td>
    <td>Kalu Jhanda</td>
  </tr>
  <tr>
    <td>8:45 AM</td>
    <td>kalu Jhanda</td>
    <td>University Campus</td>
  </tr>
  
</table>

    
    <h2>Mohali</h2>
       

    <table>
  <tr>
    <th>Time</th>
    <th>From</th>
    <th>To</th>
  </tr>
  <tr>
    <td>7:30 AM</td>
    <td>PCA Stadium</td>
    <td>Phase 3</td>
  </tr>
  <tr>
    <td>7:45 AM</td>
    <td>Phase 3</td>
    <td>Sector 40</td>
  </tr>
  <tr>
    <td>8:00 AM</td>
    <td>Sector 40</td>
    <td>Sector 25</td>
  </tr>
  <tr>
    <td>8:05 AM</td>
    <td>Sector 25</td>
    <td>Khuda Lahora</td>
  </tr>
  <tr>
    <td>8:15 AM</td>
    <td>Khuda Lahora</td>
    <td>New Chandigarh</td>
  </tr>
  <tr>
    <td>8:35 AM</td>
    <td>New Chandigarh</td>
    <td>Siswan</td>
  </tr>
  <tr>
    <td>8:45 AM</td>
    <td>Siswan</td>
    <td>University Campus</td>
  </tr>
</table>

    
      <p></p>
    </div>
  </div>
</div>





         </div>
<!--          <div class="col-md-4"> 
                       
               <section class="box" style="border: 4px dotted red";>  
               <h1 style="color:#EA2027 ; text-align:center";>Alerts</h1>           
               <div class="alert alert-info">
    <strong>Info!</strong> This alert box will tell your Attendance,Fees and other related info!
  </div>  </section>-->
              
         
      
         
        </section>
    </section>
    </body>
</html>
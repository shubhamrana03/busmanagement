<%-- 
    Document   : signup
    Created on : 17 Apr, 2019, 9:32:06 AM
    Author     : shubhamrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Sign Up</title>
        <link rel="stylesheet" type="text/css" href="cs1.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
               
            .loginbox {
                width: 320px;
                height: 420px;
                background: #C1D1D3;
                color: #fff;
                top: 50%;
                left: 50%;
                position: absolute;
                transform: translate(-50%,-50%);
                box-sizing: border-box;
                padding: 70px 30px;
            }
            
            h1{
                margin: 0;
                padding: 0 0 20px;
                text-align: center;
                font-size: 22px;
            }
            
            .loginbox{
                margin: 0;
                padding: 0;
                font-weight: bold;
            }
            
            .loginbox input{
                width: 95%;
                margin-bottom: 20px;
                
            }
            
           
            
            .loginbox input[type="submit"]{
                border: none;
                outline: none;
                height: 40px;
                background: #fb2525;
                color: #fff;
                font-size: 18px;
                border-radius: 20px;
            }
            
            .loginbox input[type="submit"]:hover
            {
                cursor: pointer;
                background: #ffc107;
                color: #000;
                
            }
            
            .loginbox a{
                text-decoration: none;
                font-size: 12px;
                line-height: 20px;
                color: aquamarine;
            }
            
            .loginbox a:hover{
                color: #f44336
            }
        </style>
        
        <script type = "text/javascript">
    
    function func1()
    {
        var x=document.getElementById("n1").value;
        
        if(x.length === 0)
        {
            alert("Please fill credentials");
        }
        else
        {
            confirm("Are you sure?");
        }
    }


</script>
        
        
    </head>
    <body background="image1/snap1.jpg">
        <div class="loginbox">
            <h1><font color="black">Sign Up for new bus service-</font></h1>
        <form action="signup" method="POST">
            <p> Enter College ID:</p><br>
            <input type="text" name="email" placeholder="Enter Username" id="n1">
            <p>Enter Password:</p><br>
            <input type="password" name="psw" id="n1" placeholder="Enter Password">
            <p> Enter Password again:
          <input type="password" placeholder="Repeat Password" name="psw-repeat" required id="n1">
            <br><br><br>
            
            <input type="submit" value="Submit" onclick="func1()"><p>
<!--                <a href="#"> Lost Your Password?</a><br>
                <a href="signup1.jsp"> Don't Have an account?</a><br>
                              -->
        </form>
    
        </div>
    </body>
</html>

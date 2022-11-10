<%@page import="com.model.Model"%>
<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Au Register Forms by Colorlib</title>

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
</head>

<body>


		<%
	
			String id =request.getParameter("id");
			int myid =Integer.parseInt(id);
			Model m = UserDao.getdetailbyid(myid);
			
		%>

    <div class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
        <div class="wrapper wrapper--w960">
            <div class="card card-2">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Update Info</h2>
                    <form action="edit2.jsp" method="post">
                    	
                    	<tr>
						<input type="hidden" name="id" value="<%=m.getId()%>">  
						</tr>
		
                    
                        <div class="input-group">
                            <input class="input--style-2" type="text" placeholder="Enter Your FirstName" name="name" value="<%=m.getName()%>">
                        </div>
                        
                         <div class="input-group">
                            <input class="input--style-2" type="text" placeholder="Enter Your LastName" name="surname" value="<%=m.getSurname()%>">
                        </div>
                        
                         <div class="input-group">
                            <input class="input--style-2" type="email" placeholder="Enter Your Email" name="email" value="<%=m.getEmail()%>">
                        </div>
                        
                         <div class="input-group">
                            <input class="input--style-2" type="password" placeholder="Enter Your Password" name="pass" value="<%=m.getPass()%>">
                        </div>
                        
                       
                        
                        <div class="p-t-30">
                            <button class="btn btn--radius btn--green" type="submit">Update</button>
                        </div>
                    </form>
                    
                    <a href="View.jsp">View Data</a>
                </div>
            </div>
        </div>
    </div>
    
    
    
    
   

    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->
<%-- 
    Document   : index
    Created on : Feb 27, 2018, 6:17:30 PM
    Author     : Mai Ly
--%>

<%@page import="modal.Category"%>
<%@page import="DAOIMPL.cateIMPL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <form action="cateServlet" method="Get" style="margin: auto; width: 600px;height: auto ">          
            <div class="form-group" style="margin: auto; width: 600px;height: auto ">
                <label for="pwd">Name</label>
                <input type="text" class="form-control" name="name" id="pwd">
            </div>        
            <button type="submit" value="add" name="action"  class="btn btn-default">Submit</button>
             <h2>Danh sách </h2>
        </form>
       
        <div class="container">
            <table class="table table-striped" style="margin: auto; width: 600px;height: auto ">
                <% cateIMPL ca=new cateIMPL(); %>
                <tr style="width: 50%">
                    <th>id</th>
                    <th>name</th>
                    <th>Action</th>
                </tr>
                <thead>
                <tbody>
                    <% for (Category x : ca.findall()) {
                                
                    %>
                    <tr>
                        <th><%=x.getCategoryId() %> </th>
                        <th><%=x.getCategoryName() %></th>
                        <th> 
                            <a href="cateServlet?action=delete&id=<%= x.getCategoryId()%>">DEL </a>
                            <a href=""></a>
                        </th>
                    </tr>
                    <% } %>
                </tbody>
                </thead>

            </table>
   

    </body>
</html>

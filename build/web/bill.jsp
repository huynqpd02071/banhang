<%-- 
    Document   : bill
    Created on : Feb 27, 2018, 11:49:14 PM
    Author     : Mai Ly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
            <div class="container">
                    <form action="khachhangSeverlet">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Tổng giá</label>
                            <input type="number" name="total" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                    
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Cách thanh toán</label>
                            <input type="text" min="0" name="payment"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                  
                        </div> 
                        <div class="form-group">
                            <label for="exampleInputEmail1">Địa chỉ</label>
                            <input type="text" min="0" name="address"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                  
                        </div>  
                         <div class="form-group">
                            <label for="exampleInputEmail1">Ngày</label>
                            <input type="date" min="0" name="date"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                  
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Thông tin khách hàng</label>
                            <input type="text" min="0" name="id_khachHang"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                  
                        </div>
                     
                        <button type="submit" name="action" value="add" class="btn btn-primary">Submit</button>
                    </form>
                </div>
    </body>
</html>

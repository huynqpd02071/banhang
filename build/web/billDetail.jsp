<%-- 
    Document   : billDetail
    Created on : Feb 28, 2018, 12:44:20 AM
    Author     : Mai Ly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
                            <label for="exampleInputEmail1">Giá sản phẩm</label>
                            <input type="number" name="gia" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                    
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Số lượng</label>
                            <input type="number" min="0" name="soLuong"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                  
                        </div> 
                        <div class="form-group">
                            <label for="exampleInputEmail1">Mã sản phẩm</label>
                            <input type="text" min="0" name="maSanPham"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                  
                        </div>  
                    
                    
                         <div class="form-group">
                            <label for="exampleInputEmail1">Mã hóa đơn</label>
                            <input type="text" min="0" name="id_bill"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >                  
                        </div>
                        <button type="submit" name="action" value="add" class="btn btn-primary">Submit</button>
                    </form>
                </div>
    </body>
</html>

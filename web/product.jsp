<%-- 
    Document   : product
    Created on : Feb 27, 2018, 7:58:25 PM
    Author     : Mai Ly
--%>

<%@page import="DAOIMPL.cateIMPL"%>
<%@page import="modal.Product"%>
<%@page import="modal.Category"%>
<%@page import="DAOIMPL.productIMPL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <% productIMPL p = new productIMPL();
            cateIMPL ct = new cateIMPL();
        %>
        <div class="container">
            <form action="productServlet">
                <div class="form-group">
                    <label for="exampleInputEmail1">Tên sản phẩm</label>
                    <input type="text" name="name" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter name">                    
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Giá bán</label>
                    <input type="number" min="0" name="price"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter price">                  
                </div>          
                <div class="form-group">
                    <label for="exampleSelect1">Danh mục</label>
                    <select class="form-control" name="danhmuc" id="exampleSelect1" >
                        <% for (Category v : ct.findall()) {
                        %>
                        <option value="<%=v.getCategoryId()%>"><%=v.getCategoryName()%></option>   
                        <% }%>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleInputFile">Image</label>
                    <input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">                 
                </div>
                <div class="form-group">
                    <label for="exampleTextarea">Mô tả sản phẩm</label>
                    <textarea class="form-control" name="mota" required="" id="exampleTextarea" rows="3"></textarea>
                </div>
                <button type="submit" name="action" value="add" class="btn btn-primary">Submit</button>
            </form>
        </div>

        <div class="container">
            <table class="table table-inverse">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Giá bán</th>
                        <th>Thông tin</th>
                        <th>Image</th>
                        <th>Danh mục</th>

                    </tr>
                </thead>
                <tbody>
                    <% for (Product z:p.findall()) {
                                                   
                    %>
                    <tr>                                              
                        <td><%= z.getProductName() %></td>
                        <td><%= z.getProductPrice() %></td>
                        <td><%= z.getProductDescription() %></td>
                        <td><%= z.getProductImage() %></td>
                        <td><%= z.getCategory().getCategoryName() %></td>
                      
                    </tr>
                    <% }%>

                </tbody>
            </table>

        </div>
    </body>
</html>

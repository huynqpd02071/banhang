/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import DAO.ProductDAO;
import common.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Category;
import modal.Product;

/**
 *
 * @author Mai Ly
 */
public class productIMPL implements ProductDAO {

    @Override
    public void add(Product x) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "INSERT INTO `dientoandammay`.`product` (`product_name`, `product_price`, `product_description`, `product_image`, `category_category_id`) VALUES (?, ?, ?,?, ?);";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setString(1, x.getProductName());
            preparedStatement.setDouble(2, x.getProductPrice());
            preparedStatement.setString(3, x.getProductDescription());
            preparedStatement.setString(4, x.getProductImage());
            preparedStatement.setInt(5, x.getCategory().getCategoryId());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xoa(int id) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "delete from product where product_id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(productIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean sua(Product c) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "update product\n"
                    + "set product_name=?,product_price=?, product_description=?,product_image=?\n"
                    + "where product_id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setString(1, c.getProductName());
            preparedStatement.setDouble(2, c.getProductPrice());
            preparedStatement.setString(3, c.getProductDescription());
            preparedStatement.setString(4, c.getProductImage());
            preparedStatement.setInt(5, c.getProductId());
            preparedStatement.executeUpdate();
            return true;
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(productIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }//To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public List<Product> findall() {
        ArrayList<Product> all = new ArrayList<>();
        try {

            Connection conn = new ConnectDB().getConnect();
            String SQL = "select p.product_id,p.product_name,p.product_price,p.product_description,p.product_image,c.category_name\n"
                    + "from product p,category c\n"
                    + "where p.category_category_id=c.category_id";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), new Category(rs.getString(6)), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5));
                all.add(p);
            }

            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(productIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
    }

}

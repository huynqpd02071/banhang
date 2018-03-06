/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import DAO.Catedao;
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

/**
 *
 * @author Mai Ly
 */
public class cateIMPL implements Catedao{

    @Override
    public void add(Category x) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "INSERT INTO `dientoandammay`.`category` (`category_name`) VALUES (?)";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setString(1, x.getCategoryName());            
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
            String SQL = "delete from category where category_id=?;";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setInt(1, id);            
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean sua(Category c) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "UPDATE `dientoandammay`.`category` SET `category_id`=?, `category_name`=? WHERE `category_id`=?;";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setString(1, c.getCategoryName()); 
            preparedStatement.setInt(2, c.getCategoryId());              
            preparedStatement.executeUpdate();
            return true;
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(cateIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Category> findall() {
         List<Category> all=new ArrayList<>();
        try {
            String SQL="SELECT * FROM dientoandammay.category;";
           
            Connection conn = new ConnectDB().getConnect();
            
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()) {                
                Category x=new Category(rs.getInt(1), rs.getString(2));
                all.add(x);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cateIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
        
    }
    public static void main(String[] args) {
        cateIMPL x=new cateIMPL();
        for (int i = 0; i < x.findall().size(); i++) {
            System.out.println(x.findall().get(i).getCategoryName());
            System.out.println(x.findall().get(i).getCategoryId());
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import DAO.KhachhangDAO;
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
import modal.Khachhang;

/**
 *
 * @author Mai Ly
 */
public class khachHangIMPL implements KhachhangDAO{

    @Override
    public void add(Khachhang x) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "INSERT INTO `dientoandammay`.`khachhang` (`fname`, `lname`, `fullname`, `sex`, `phone`, `email`, `adress`) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setString(1, x.getFname());            
            preparedStatement.setString(2, x.getLname());            
            preparedStatement.setString(3, x.getFullname());  
            preparedStatement.setBoolean(4, x.getSex());
            preparedStatement.setString(5, x.getPhone());
            preparedStatement.setString(6, x.getEmail());
            preparedStatement.setString(7, x.getAdress());
            preparedStatement.executeUpdate();
               System.out.println("oks");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("gg");
        }
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xoa(int id) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "delete from dientoandammay.khachhang where khachhang.id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setInt(1, id);            
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean sua(Khachhang c) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "UPDATE `dientoandammay`.`khachhang` SET `fname`=?, `lname`=?, `fullname`=?, `sex`=?, `phone`=?, `email`=?, `adress`=? WHERE `id`=?;";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setString(1, c.getFname()); 
            preparedStatement.setString(2, c.getLname()); 
            preparedStatement.setString(3, c.getFullname()); 
            preparedStatement.setBoolean(4, c.getSex()); 
              preparedStatement.setString(5, c.getPhone());
            preparedStatement.setString(6, c.getEmail());
            preparedStatement.setString(7, c.getAdress());              
            preparedStatement.executeUpdate();
            return true;
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(cateIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Khachhang> findall() {
        
        List<Khachhang> all=new ArrayList<>();
        try {
            String SQL="SELECT * FROM dientoandammay.khachhang;";
           
            Connection conn = new ConnectDB().getConnect();
            
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()) {                
                Khachhang x=new Khachhang(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6), rs.getString(7), rs.getString(8));
                all.add(x);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cateIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
      
        //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        khachHangIMPL x=new khachHangIMPL();
        for (Khachhang b :x.findall()) {
            System.out.println(b.getId());   
            System.out.println(b.getFullname());   
            System.out.println(b.getSex());   
            System.out.println(b.getEmail());   
            System.out.println(b.getPhone());   
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import DAO.billdetal;
import common.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.BillDetail;
import modal.Khachhang;
import modal.Product;

/**
 *
 * @author Mai Ly
 */
public class billDetalIMPL implements billdetal {

    @Override
    public void add(BillDetail x) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "INSERT INTO `dientoandammay`.`bill_detail` (`price`, `quantity`, `product_product_id`, `bill_bill_id`) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setDouble(1, x.getPrice());
            ps.setInt(2, x.getQuantity());
            ps.setInt(3, x.getProduct().getProductId());
            ps.setInt(4, x.getBill().getBillId());
            ps.executeLargeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(billDetalIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void xoa(int id) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "delete from bill_detail where bill_detail_id=?";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(billDetalIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean sua(BillDetail c) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "update bill_detail\n"
                    + "set price=?,quantity=?,product_product_id=?,bill_bill_id=?\n"
                    + "where bill_detail_id=?";
            PreparedStatement ps = conn.prepareStatement(SQL);
           ps.setDouble(1, c.getPrice());
           ps.setInt(2, c.getQuantity());
           ps.setInt(3, c.getProduct().getProductId());
           ps.setInt(4, c.getBill().getBillId());
            ps.executeUpdate();
            return true;
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(billDetalIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<BillDetail> findall() {
           List<BillDetail> all=new ArrayList<>();
        try {
            String SQL="SELECT * FROM dientoandammay.khachhang;";
           
            Connection conn = new ConnectDB().getConnect();
            
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()) {                
                BillDetail x=new BillDetail(rs.getInt(1), new Product(rs.getString(4)), rs.getDouble(2), rs.getInt(3));
                all.add(x);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cateIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
         //To change body of generated methods, choose Tools | Templates.
    }

}

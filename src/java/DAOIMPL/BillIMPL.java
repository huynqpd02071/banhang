/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMPL;

import DAO.Billdao;
import common.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Bill;
import modal.Khachhang;

/**
 *
 * @author Mai Ly
 */
public class BillIMPL implements Billdao {

    @Override
    public void add(Bill x) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "INSERT INTO `dientoandammay`.`bill` (`total`, `payment`, `address`, `date`, `khachhang_2_id`, `bill_id`) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setDouble(1, x.getTotal());
            preparedStatement.setString(2, x.getPayment());
            preparedStatement.setString(1, x.getAddress());
            preparedStatement.setString(4, x.getDate());
            preparedStatement.setInt(0, x.getKhachhang().getId());
            preparedStatement.setInt(6, x.getBillId());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xoa(int id) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "delete from bill where bill.bill_id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean sua(Bill c) {
        try {
            Connection conn = new ConnectDB().getConnect();
            String SQL = "INSERT INTO `dientoandammay`.`bill` (`total`, `payment`, `address`, `date`, `khachhang_2_id`, `bill_id`) VALUES ('?', '?', '?', '?', '?', '?');";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setDouble(1, c.getTotal());
            preparedStatement.setString(2, c.getPayment());
            preparedStatement.setString(3, c.getAddress());
            preparedStatement.setString(4, c.getDate());
            preparedStatement.setInt(5, c.getKhachhang().getId());

            preparedStatement.executeUpdate();
            return true;
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(cateIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bill> findall() {
        List<Bill> all = new ArrayList<>();
        try {
            String SQL = "SELECT  k.fullname,b.total,b.payment,b.address,b.date,b.bill_id\n"
                    + "from khachhang k,bill b\n"
                    + "where k.id=b.khachhang_2_id";

            Connection conn = new ConnectDB().getConnect();

            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Bill x = new Bill(rs.getInt(1), new Khachhang(rs.getString(2)),rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6));
                all.add(x);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cateIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
    }

}

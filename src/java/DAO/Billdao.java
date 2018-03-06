/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modal.Bill;

/**
 *
 * @author Mai Ly
 */
public interface Billdao {
     public void add(Bill x);
    public void xoa(int id);
    public boolean sua(Bill c);
    public List<Bill> findall();
}

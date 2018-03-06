/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modal.BillDetail;

/**
 *
 * @author Mai Ly
 */
public interface billdetal {
     public void add(BillDetail x);
    public void xoa(int id);
    public boolean sua(BillDetail c);
    public List<BillDetail> findall();
}

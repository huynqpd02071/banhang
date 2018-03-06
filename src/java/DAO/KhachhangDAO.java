/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modal.Khachhang;

/**
 *
 * @author Mai Ly
 */
public interface KhachhangDAO {
     public void add(Khachhang x);
    public void xoa(int id);
    public boolean sua(Khachhang c);
    public List<Khachhang> findall();
}

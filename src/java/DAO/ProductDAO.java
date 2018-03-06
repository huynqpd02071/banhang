/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modal.Product;

/**
 *
 * @author Mai Ly
 */
public interface ProductDAO {
       public void add(Product x);
    public void xoa(int id);
    public boolean sua(Product c);
    public List<Product> findall();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modal.Category;

/**
 *
 * @author Mai Ly
 */
public interface Catedao {
    public void add(Category x);
    public void xoa(int id);
    public boolean sua(Category c);
    public List<Category> findall();
}

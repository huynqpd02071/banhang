/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAOIMPL.khachHangIMPL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Khachhang;

/**
 *
 * @author Mai Ly
 */
@WebServlet(name = "khachhangSeverlet", urlPatterns = {"/khachhangSeverlet"})
public class khachhangSeverlet extends HttpServlet {
khachHangIMPL khIML=new khachHangIMPL();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("id");
            String fistname = request.getParameter("fistname");
            String lastname = request.getParameter("lastname");
            String fullname = request.getParameter("fullname");
            String sex = request.getParameter("sex");
            String phone = request.getParameter("phone");
            String Gmail = request.getParameter("gmail");
            String address = request.getParameter("address");
            String action = request.getParameter("action");
            switch (action) {               
                case "add":
                    Khachhang kh=new Khachhang();
                    kh.setFname(fullname);
                    kh.setLname(lastname);
                    kh.setFullname(fullname);
                    boolean b;
                      if (sex.equalsIgnoreCase("true")) {
                        b=true;
                    } else {
                           b=false;
                    }
                     kh.setSex(b);
                    kh.setPhone(phone);
                    kh.setEmail(Gmail); 
                    kh.setAdress(address); 
               khIML.add(kh);
               break;
               case "delete":
                   int idx=Integer.parseInt(id);
                   khIML.xoa(idx);
                   break;
                   
            }
            request.getRequestDispatcher("khachhang.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contollers;

import Contollers.Modes.ActionMode;
import Models.DAOs.ManufacturerDAO;
import Models.POJOs.ManufacturerPOJO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tannguyen
 */
@WebServlet(name = "GetManufacturerAllController", urlPatterns = {"/GetManufacturerAllController"})
public class GetManufacturerAllController extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Object obj = request.getAttribute("actionMode");
        ActionMode mode = (ActionMode) obj;
        try {
            if (mode == ActionMode.Get) {
                ArrayList<ManufacturerPOJO> list = ManufacturerDAO.getManufacturerAll();
                request.setAttribute("manufacturer", list);
                request.removeAttribute("actionMode");
                String source = String.valueOf(request.getAttribute("source"));
                String url = "/index.jsp";
                if (source.equals("customer")) {
                    url = "/customerCare.jsp";
                }
                if(source.equals("login")){
                    url = "/login.jsp";
                }
                if(source.equals("register")){
                    url = "/register.jsp";
                }
                if(source.equals("view")){
                    url = "/viewProduct.jsp";
                }
                if(source.equals("viewDetail")){
                    url = "/viewProductDetail.jsp";
                }
                if(source.equals("cartDetail")){
                    url = "/cartDetail.jsp";
                }
                if(source.equals("checkout")){
                    url = "/checkout.jsp";
                }
                if(source.equals("search")){
                    url = "/search.jsp";
                }

               
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
        } catch (Exception ex) {
            out.print(ex.getMessage());
        } 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
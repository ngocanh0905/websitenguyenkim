/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contollers;

import Models.DAOs.CommodityDAO;
import Models.POJOs.CommodityPOJO;
import Models.POJOs.OrderDetailPOJO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tannguyen
 */
@WebServlet(name = "updCart", urlPatterns = {"/updCart"})
public class updCart extends HttpServlet {

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
        HttpSession session = request.getSession();
        try {
            String sId = request.getParameter("id");
            String i = request.getParameter("sl");
            int sl = Integer.parseInt(i);
            int id = Integer.parseInt(sId);

            ArrayList<OrderDetailPOJO> a = (ArrayList<OrderDetailPOJO>) session.getAttribute("cart");
            for (OrderDetailPOJO o : a) {
                if (o.getCommodity().getCommodityId() == id) {
                    o.setAmount(sl);
                }
                if(o.getAmount()==0){
                    a.remove(o);
                }
            }
            session.setAttribute("cart", a);
            response.sendRedirect("cartDetail.jsp");

        } finally {
            out.close();
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
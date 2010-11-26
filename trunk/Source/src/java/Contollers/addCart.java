/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contollers;

import Models.DAOs.CommodityDAO;
import Models.POJOs.CommodityPOJO;
import Models.POJOs.OrderDetailPOJO;
import Models.POJOs.OrderPOJO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "addCart", urlPatterns = {"/addCart"})
public class addCart extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        try {
            String sId = request.getParameter("id");
            String i = request.getParameter("sl");
            int sl = Integer.parseInt(i);
            int id = Integer.parseInt(sId);
            CommodityPOJO p = CommodityDAO.getProductById(id);
            OrderDetailPOJO ord = new OrderDetailPOJO();
            ord.setCommodity(p);
            ord.setAmount(sl);
            ord.setPrice(p.getUnitPrice());

            ArrayList<OrderDetailPOJO> a = (ArrayList<OrderDetailPOJO>) session.getAttribute("cart");
            if (a == null) {
                a = new ArrayList<OrderDetailPOJO>();
            }
            boolean f = true;
            for (OrderDetailPOJO o : a) {
                if (o.getCommodity().getCommodityId() == id) {
                    o.setAmount(o.getAmount() + sl);
                    f = false;
                }
            }
            if (f) {
                a.add(ord);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(addCart.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(addCart.class.getName()).log(Level.SEVERE, null, ex);
        }
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

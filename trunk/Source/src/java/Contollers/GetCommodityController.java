/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contollers;

import Contollers.Modes.ActionMode;
import Models.DAOs.CommodityDAO;
import Models.POJOs.CommodityPOJO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "GetCommodityController", urlPatterns = {"/GetCommodityController"})
public class GetCommodityController extends HttpServlet {

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

        Object obj = request.getAttribute("actionMode");
        ActionMode action = (ActionMode) obj;
        try {
            if (action == ActionMode.Get) {
                String ctid = request.getParameter("ctId");
                int ctId = 1, mId = 1;
                if (ctid != null) {
                    ctId = Integer.parseInt(ctid);
                }
                String mid = request.getParameter("mId");
                if (mid != null) {
                    mId = Integer.parseInt(mid);
                }
                ArrayList<CommodityPOJO> ds = new ArrayList<CommodityPOJO>();
                if (mId == 0) {
                    ds = CommodityDAO.getProductByCt(ctId);
                } else {
                    ds = CommodityDAO.getProductByCM(ctId, mId);
                }

                request.setAttribute("Commodity", ds);
                request.removeAttribute("actionMode");
                String url = "/viewProduct.jsp";
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(GetCommodityController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(GetCommodityController.class.getName()).log(Level.SEVERE, null, ex);
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

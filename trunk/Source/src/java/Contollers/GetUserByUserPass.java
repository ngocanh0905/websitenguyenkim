/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contollers;

import Contollers.Modes.ActionMode;
import Models.DAOs.UserDAO;
import Models.POJOs.RolePOJO;
import Models.POJOs.UserPOJO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "GetUserByUserPass", urlPatterns = {"/GetUserByUserPass"})
public class GetUserByUserPass extends HttpServlet {

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
        Object obj = request.getAttribute("source");
        String ac = request.getParameter("ac");
        String source = String.valueOf(obj);
        try {

            if (!source.equals("out")) {
                String username = String.valueOf(request.getParameter("username"));
                String pass = String.valueOf(request.getParameter("password"));
                UserPOJO user = UserDAO.getUserByUserPass(username, pass);
                String url = "/pages/message.jsp";
                if (user != null) {
                    session.setAttribute("isLogin", "true");
                    session.setAttribute("user", user);
                    
                } else {
                    session.setAttribute("isLogin", "false");
                }
                request.setAttribute("source", "login");
                //    request.removeAttribute("actionMode");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            } else {
                session.invalidate();
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/pages/message.jsp");
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

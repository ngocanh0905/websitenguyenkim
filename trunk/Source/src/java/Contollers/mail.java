/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contollers;

import javax.servlet.*;

import javax.servlet.http.*;

import java.io.*;

import javax.mail.*;

import javax.mail.internet.*;   // important

import javax.mail.event.*;      // important

import java.net.*;

import java.util.*;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tannguyen
 */
@WebServlet(name = "mail", urlPatterns = {"/mail"})
public class mail extends HttpServlet {

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
        response.setContentType("text/html");
    

        try {



            Properties props = new Properties();
            props.put("stt", "localhost");   //  'localhost' for testing
            Session session1 = Session.getDefaultInstance(props, null);
            String s1 = "mr.tannguyen@live.com";//request.getParameter("text1"); //sender (from)
            String s2 = "tan.nguyenbao@gmail.com";//request.getParameter("text2");
            String s3 = "Hello mail";//request.getParameter("text3");
            String s4 = "This is mail has been sent from Sevlet";//request.getParameter("area1");
            Message message = new MimeMessage(session1);
            message.setFrom(new InternetAddress(s1));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(s2, false));
            message.setSubject(s3);
            message.setText(s4);
            Transport.send(message);

            out.println("mail has been sent");

        } catch (Exception ex) {

            System.out.println("ERROR....." + ex);

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

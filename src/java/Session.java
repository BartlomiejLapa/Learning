/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.lineSeparator;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
@WebServlet(name="Session", urlPatterns = {"/Session.do"})
public class Session extends HttpServlet {

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
            
            out.print("<center>");
           
            if (request.getSession(false) == null)
            {
                out.println("Witaj na stronie po raz pierwszy!");
                request.getSession();
            }
            else {
                out.println("<h2>Witaj ponownie</h2><br>Sesja zakonczy swoj czas po 1 min");
                
            }
            
            out.println("<br><br>Autorem serwletu jest: <b>" + this.getInitParameter("autor") + "</b><br>" + this.getServletName() + " / " + this.getServletInfo() + " / " + this.getServletContext() + " / " + this.getServletConfig());
            
            
          
            
            
             out.print("</center>");
             
             ServletContext sc = this.getServletContext();
             synchronized(sc)
             {
                 Object counter = sc.getAttribute("counter");
                 if(counter == null) sc.setAttribute("counter", 1);
                 else {
                     counter = sc.getAttribute("counter");
                     sc.setAttribute("counter", Integer.parseInt(counter.toString())+1);
                 }
             }
   
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pedro
 */
@WebServlet(urlPatterns = {"/juroscomposto.html"})
public class JurosComposto extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
             out.println("</head>");
             out.println("<title>Juros Composto</title>"); 
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Fórmula do Juros Composto</h1>");
            
            out.println("<h2>M = C . (1 +  i)<sup>n</sup></h2>");
            out.println("<h3>C = Capital inicial</h3>");
            out.println("<h3>i = Taxa de juros</h3>");
            out.println("<h3>n = Tempo/Periodo</h3>");
            
            out.println("<h1>Insira a taxa de juros:</h1>");
            out.println("<p><form action='calculo2.html'>"
                    + "&nbsp;i = <input type='text' name='y'/></p>");
            
            out.println("<h1>Insira o restante dos dados:</h1>");
            out.println("<p><form action='calculo2.html'>"
                    + "C = <input type='text' name='x'/></p>");
            out.println("<p><form action='calculo2.html'>"
                    + "n = <input type='text' name='z'/></p>");
            
            out.println("<input type='submit' value='Calcular'/>");
            
            out.println("<h1><a href='home.html'>Voltar</a></h1>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
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

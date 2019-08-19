/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pedro
 */
@WebServlet(urlPatterns = {"/calculo2.html"})
public class Calculo2 extends HttpServlet {

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
            DecimalFormat df = new DecimalFormat("#.00");
             
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            
            
            out.println("<h1>Resultado para o calculo:</h1>");
            
            int x = Integer.parseInt(request.getParameter("x"));
            double y = Double.parseDouble(request.getParameter("y"));
            int z = Integer.parseInt(request.getParameter("z"));
            double result;
            double calc2 = 0;
            double calc3 = 0;
            
            if (y > 0) {
                 calc2 = (y / 100);
                 calc3 = calc2 + 1;
                 
            }
            
            result = (double) Math.pow(calc3, z);
            result = result * x;
            
            out.println("<table border=3>");
            
            out.println("<tr>");
            out.println("<h1><td><strong>CAPITAL</strong></td></h1>");
            out.println("<h1><td><strong>"+ x +"</strong></td></h1>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<h1><td><strong>TAXA</strong></td></h1>");
            out.println("<h1><td><strong>"+ y +"</strong></td></h1>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<h1><td><strong>PERIODO</strong></td></h1>");
            out.println("<h1><td><strong>"+ z +" M/A</strong></td></h1>");
            out.println("</tr>");
           
            
            out.println("<tr>");
            out.println("<h1><td><strong>MONTANTE</strong></td></h1>");
            out.println("<h1><td><strong>" + df.format(result)  + "</strong></td></h1>");
            out.println("</tr>");
            
            
            
            out.println("</table>");
            out.println("<h1><a href='juroscomposto.html'>Voltar</a></h1>");
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

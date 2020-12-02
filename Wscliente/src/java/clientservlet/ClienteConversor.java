/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import wsaula.ConversorService;

/**
 *
 * @author fgabr
 */
@WebServlet(name = "ClienteConversor", urlPatterns = {"/ClienteConversor"})
public class ClienteConversor extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8000/conversor.wsdl")
    private ConversorService service;

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
        
        String m = request.getParameter("moeda");
        String a = request.getParameter("valor");
        double b = Double.parseDouble(a);
        double result;
        DecimalFormat df = new DecimalFormat();
        
        switch(m) {
            case "rd":
                result = realToDolar(b);
                break;
            case "dr":
                result = dolarToReal(b);
                break;
            case "re":
                result = realToEuro(b);
                break;
            case "er":
                result = euroToReal(b);
                break;
            case "rpa":
                result = realToPesoArgentino(b);
                break;
            case "par":
                result = pesoargentinoToReal(b);
                break;
            default:
                result = 0.0;
        }
              
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado Conversão</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Resultado: " + df.format(result) + "</h3>");
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

    private double dolarToReal(double arg0) {
        wsaula.Conversor port = service.getConversorPort();
        return port.dolarToReal(arg0);
    }

    private double euroToReal(double arg0) {
        wsaula.Conversor port = service.getConversorPort();
        return port.euroToReal(arg0);
    }

    private double pesoargentinoToReal(double arg0) {
        wsaula.Conversor port = service.getConversorPort();
        return port.pesoargentinoToReal(arg0);
    }

    private double realToDolar(double arg0) {
        wsaula.Conversor port = service.getConversorPort();
        return port.realToDolar(arg0);
    }

    private double realToEuro(double arg0) {
        wsaula.Conversor port = service.getConversorPort();
        return port.realToEuro(arg0);
    }

    private double realToPesoArgentino(double arg0) {
        wsaula.Conversor port = service.getConversorPort();
        return port.realToPesoArgentino(arg0);
    }

}
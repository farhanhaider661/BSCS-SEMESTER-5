package files;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Imran
 */
@WebServlet(urlPatterns = {"/NewServlet2"})
public class NewServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String str1 = null;
            String str2 = null;
                   
            
            Cookie cookies[] = request.getCookies();
            for(Cookie c:cookies)
            {
                if(c.getName().equals("t1"))
                {
                    str1 = c.getValue();
                }
                if(c.getName().equals("t2"))
                {
                    str2 = c.getValue();
                }
            }
            
            
            
            
            
            
            
            
            
            HttpSession session = request.getSession();
            int a = Integer.parseInt(session.getAttribute("t1").toString());
            int b = Integer.parseInt(session.getAttribute("t2").toString());
            
            int c = a+b;
            
            out.println("Sum is "+c);
            
            
        }
    }

}

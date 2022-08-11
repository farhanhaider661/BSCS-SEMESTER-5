package files

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/Add1"})
public class Add extends HttpServlet

{
    public void service(HttpServletRequest request, HttpServletResponse response)
    {
       try
       {
            //RequestDispatcher rd = request.getRequestDispatcher("NewServlet");
            //rd.forward(request, response);
           
           String str1 = request.getParameter("t1");
           String str2 = request.getParameter("t2");
           
          // HttpSession session = request.getSession();
          // session.setAttribute("t1", str1);
          // session.setAttribute("t2", str2);
          
          Cookie cookie1 = new Cookie ("t1", str1);
          Cookie cookie2 = new Cookie ("t2", str2);
          response.addCookie(cookie1);
          response.addCookie(cookie2);
          
           
          
           
           
           response.sendRedirect("NewServlet");
       }
       catch(Exception ex)
       {
           
       }
        
    }
}

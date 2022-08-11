package files;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/validation"})
public class validation extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String uname = request.getParameter("t1");
            String pass = request.getParameter("t2");
            
            
            
            
            // query based verification
            // code based verfication
            
            
            
            if(uname.equals("Imran")&&pass.equals("123"))
            {
                HttpSession session = request.getSession();
                session.setAttribute("uname", uname);
                response.sendRedirect("View");
            }
            else
            {
                response.sendRedirect("index.html");
            }
            
            
        }
    }

}

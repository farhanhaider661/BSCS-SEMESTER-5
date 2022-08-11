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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Imran
 */
@WebServlet(urlPatterns = {"/Update"})
public class Update extends HttpServlet {

     protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Student s = new Student();
            StudentDao dao = new StudentDao();
            
            s.Id = Integer.parseInt(request.getParameter("t1"));
            s.Name = request.getParameter("t2");
            s.Degree = request.getParameter("t3");
            s.CellNumber = request.getParameter("t4");
            
            int a = dao.Update(s);
            
            if(a>0)
            {
                response.sendRedirect("View");
            }
        }
    }

   
}

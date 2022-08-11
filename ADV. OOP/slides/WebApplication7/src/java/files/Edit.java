package files;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Edit"})
public class Edit extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Student s= new Student();
            StudentDao dao = new StudentDao();
            s.Id = Integer.parseInt(request.getParameter("id"));
            ResultSet rs = dao.SelectById(s);
            rs.next();
           
            
            out.println("<form action='Update' method='post'>");
            out.println("Id:");
            out.println("<input type='text' value="+rs.getString(1)+" name='t1'>");
            out.println("<br>");
            out.println("Name:");
            out.println("<input type='text' value="+rs.getString(2)+" name='t2'>");
            out.println("<br>");
            out.println("Degree:");
            out.println("<input type='text' value="+rs.getString(3)+" name='t3'>");
            out.println("<br>");
            out.println("Cell Number:");
            out.println("<input type='text' value="+rs.getString(4)+" name='t4'>");
            out.println("<br>");
            out.println("<input type='submit' value='Update'>");
            
        out.println("</form>");
            
            
            
            
        }
        catch(Exception ex)
        {
            
        }
    }

}

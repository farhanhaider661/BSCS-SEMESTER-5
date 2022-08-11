package files;



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
@WebServlet(urlPatterns = {"/Insert"})
public class Insert extends HttpServlet {

    
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
            
            int a = dao.Insert(s);
            
            if(a>0)
            {
                out.println("Inserted Successfully");
                out.println("To view the data <a href='View'>Click Here</a>");
            }
        }
    }

   
}

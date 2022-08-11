
<%@page import="files.*,java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            Student s = new Student();
            StudentDao dao = new StudentDao();
            
            if(request.getParameter("t1")!=null)
            {
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
            %>
        <div>My First Web Application</div>
        <form action="newjsp.jsp" method="post">
            Id:
            <input type="text"  name="t1">
            <br>
            Name:
            <input type="text" name="t2">
            <br>
            Degree:
            <input type="text" name="t3">
            <br>
            Cell Number:
            <input type="text" name="t4">
            <br>
            <input type="submit" value="Add">
            
        </form>
        
        
        
        To view the data <a href='View'>Click Here</a>
        
        
    </body>
</html>


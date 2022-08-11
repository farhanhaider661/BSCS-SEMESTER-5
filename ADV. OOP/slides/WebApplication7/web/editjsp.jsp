<%@page import="files.*,java.sql.*" contentType="text/html"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
    <body>
        <%!
            String id;
            String name;
            String degree;
            String cellnumber;
            int a,b,c;
        %>
        
        <%
            Student s= new Student();
            StudentDao dao = new StudentDao();
            s.Id = Integer.parseInt(request.getParameter("id"));
            ResultSet rs = dao.SelectById(s);
            rs.next();
            id = rs.getString(1);
            name = rs.getString(2);
            degree = rs.getString(3);
            cellnumber = rs.getString(4);
            

            a = 10;
            
         %> 
         <%=a%>
         <% b = 15;%>
         
        <div class="container">
        <form action="Insert" method="post">
            
            <div class="form-group">
    <label for="email">Email address:</label>
    <input type="text" class="form-control" value="<%=id%>"  name="t1">
    
  </div>
            
            <div class="form-group">
    <label for="email">Email address:</label>
    <input type="text" class="form-control" value="<%=name%>" name="t2">
  </div>
            
            <div class="form-group">
    <label for="email">Email address:</label>
    <input type="text" class="form-control" value="<%=degree%>" name="t3">
  </div>
            
            <div class="form-group">
    <label for="email">Email address:</label>
    <input type="text" class="form-control" value="<%=cellnumber%>" name="t4">
  </div>
            
            <input class="btn-danger" type="submit" value="Update">
           
        </form>
        </div>
    </body>
</html>

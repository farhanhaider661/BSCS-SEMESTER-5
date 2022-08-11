<%@page import="files.*, java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
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
        String abc()
        {
          return "abc";  
        }
        %>
    <table class="table">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Degree</th>
                <th>CellNumber</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <%
                StudentDao dao = new StudentDao();
                ResultSet rs = dao.SelectAll();

                while (rs.next()) 
                {
                %>
                <tr class="success">
                    <td>
                        <%=rs.getString(1)%>
                    </td>
                    <td>
                        <%=rs.getString(2)%>
                    </td>
                    <td>
                        <%=abc()%>
                    </td>
                    <td>
                        <%=rs.getString(4)%>
                    </td>
                    <td>
                        <a href="editjsp.jsp?id=<%=rs.getString(1)%>" >Edit</a>
                    </td>
                    <td>
                        <a href="Delete?id=<%=rs.getString(1)%>" >Delete</a>
                    </td>
                </tr>
                <%}%>
                
        </table>
        
        
        
    </body>
</html>

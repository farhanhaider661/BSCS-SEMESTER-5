package files;



import java.sql.*;

public class StudentDao 
{
    Connection con = null;
    public void connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dbstudentsystem";
            con = DriverManager.getConnection(url,"root","");
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    public int Insert(Student s)
    {
        int res = 0;
        try
        {
            connection();
            String qry = "insert into tblstudentsystem values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setInt(1, s.Id);
            pst.setString(2, s.Name);
            pst.setString(3, s.Degree);
            pst.setString(4, s.CellNumber);
            res = pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return res;
    }
    public int Update(Student s)
    {
        int res = 0;
        try
        {
            connection();
            String qry = "update tblstudentsystem set strName = ?, strDegree = ?, strCellNumber = ? where intId= ?";
            PreparedStatement pst = con.prepareStatement(qry);
            
            pst.setString(1, s.Name);
            pst.setString(2, s.Degree);
            pst.setString(3, s.CellNumber);
            pst.setInt(4, s.Id);
            res = pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return res;
    }
    public int Delete(Student s)
    {
        int res = 0;
        try
        {
            connection();
            String qry = "delete from tblstudentsystem where intId= ?";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setInt(1, s.Id);
            res = pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return res;
    }
    public ResultSet SelectById(Student s)
    {
        ResultSet res = null;
        try
        {
            connection();
            String qry = "select * from tblstudentsystem where intId= ?";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setInt(1, s.Id);
            res = pst.executeQuery();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return res;
    }
    public ResultSet SelectAll()
    {
        ResultSet res = null;
        try
        {
            connection();
            String qry = "select * from tblstudentsystem";
            Statement pst = con.createStatement();
            
            res = pst.executeQuery(qry);
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        return res;
    }
    
}

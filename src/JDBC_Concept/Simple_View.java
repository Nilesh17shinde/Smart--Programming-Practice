package JDBC_Concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Simple_View {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_db","root","root");
        PreparedStatement ps= con.prepareStatement("select*from register");
        ResultSet rs=ps.executeQuery();
         while (rs.next()){
             int id=rs.getInt("id");
             String name=rs.getString("name");
             String email=rs.getString("email");
             String gender=rs.getString("gender");
             String password=rs.getString("password");
             String city=rs.getString("city");
             System.out.println(id+" "+name+" "+" "+email+" "+gender+" "+password+" "+city);
         }
         con.close();
    }
}

package JDBC_Concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Simple_Insert {
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_db","root","root");
        PreparedStatement ps=con.prepareStatement("insert into register values('Nilesh Shinde','nilesh@gmail.com','Male','Nilesh@123','Pune')");
        int i=ps.executeUpdate();
        if (i>0){
            System.out.println("Record inserted Successfully..");
        }else {
            System.out.println("Something is Wrong...");
        }
    }
}

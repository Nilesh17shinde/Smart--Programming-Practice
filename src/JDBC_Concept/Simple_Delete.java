package JDBC_Concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Simple_Delete {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------Delete Record-------------------");
        System.out.print("id: ");
        int id= sc.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_db","root","root");
        PreparedStatement ps= con.prepareStatement("delete from register where id=?");
        ps.setInt(1,id);

        int i= ps.executeUpdate();
        if(i>0){
            System.out.println("Deleted");
        }else {
            System.out.println("fail");
        }
    }
}

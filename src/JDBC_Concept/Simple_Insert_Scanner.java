package JDBC_Concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Simple_Insert_Scanner {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------Somple Crud Project--------------------------");
        System.out.print("Name: ");
        String name= sc.nextLine();
        System.out.print("Email: ");
        String email=sc.nextLine();
        System.out.print("Gender: ");
        String gender=sc.nextLine();
        System.out.print("Password: ");
        String password=sc.nextLine();
        System.out.print("City: ");
        String city=sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_db","root","root");
        PreparedStatement ps=con.prepareStatement("insert into register(id,name,email,gender,password,city)"+" values(id,?,?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,gender);
        ps.setString(4,password);
        ps.setString(5,city);

        int i=ps.executeUpdate();
        if (i>0){
            System.out.println("Record Inserted Successfully..");
        }else {
            System.out.println("Fail");
        }
        con.close();
    }
}

package JDBC_Concept.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Pract_In {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Address: ");
        String address=sc.nextLine();
        System.out.print("Marks: ");
        int mark=sc.nextInt();

        if (mark < 45) {
            System.out.println("You are not Eligible!..");
        }else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_db","root","root");
                PreparedStatement ps=con.prepareStatement("insert into student1 (id,name,address,mark)"+"values (id,?,?,?)");
                ps.setString(1,name);
                ps.setString(2,address);
                ps.setInt(3,mark);
                int i= ps.executeUpdate();
                System.out.println("Data saved successfully!..");

                PreparedStatement ps1= con.prepareStatement("SELECT * from student1");
                ResultSet rs=ps1.executeQuery();
                while (rs.next()){
                    System.out.print(name+" "+address+" "+mark);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("You are Eligible!..");
        }
    }
}

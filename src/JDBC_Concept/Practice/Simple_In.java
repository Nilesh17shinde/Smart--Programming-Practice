package JDBC_Concept.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Simple_In {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------Crud Operation using JDBC---------------------");
        System.out.print("SName: ");
        String name=sc.nextLine();
        System.out.print("SAddress: ");
        String address= sc.nextLine();
        System.out.print("Mob No: ");
        String mob_no= sc.next();
        System.out.print("Marks: ");
        int score= sc.nextInt();

        if (score < 60){
            System.out.println("Registration Not Successfully");
        }else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_db","root","root");
                PreparedStatement ps = con.prepareStatement("insert into student (id,name,address,mob_no,score)"+"values (id,?,?,?,?)");
                ps.setString(1, name);
                ps.setString(2, address);
                ps.setString(3, mob_no);
                ps.setInt(4, score);

                int i = ps.executeUpdate();
                System.out.println("Data saved Successfully...");

                PreparedStatement ps1= con.prepareStatement("select *from student");
                ResultSet rs=ps1.executeQuery();
                while (rs.next()){

                    System.out.println(name+" "+address+" "+mob_no+" "+score);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Register Successfully...");
        }
    }
}

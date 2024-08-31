package JDBC_Concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Simple_Update {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------Update Record you want-----------------");
        System.out.print("City: ");
        String city=sc.nextLine();
        System.out.print("id: ");
        int id=sc.nextInt();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_db","root","root");
        PreparedStatement ps= con.prepareStatement("update register set city=? where id=?");
        ps.setString(1,city);
        ps.setInt(2,id);

        int cout= ps.executeUpdate();
        if (cout>0){
            System.out.println("Updated Successfully...");
        }else {
            System.out.println("Fail");
        }

        con.close();
    }
}

package Exception;

import java.io.FileInputStream;

public class Readfile {
    public static void main(String[] args) {
        try{
            FileInputStream obj=new FileInputStream("F:/Nilesh Resume/10_03_2023/Nilesh.pdf");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

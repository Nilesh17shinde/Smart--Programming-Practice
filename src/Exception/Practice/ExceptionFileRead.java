package Exception.Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionFileRead {
    public static void main(String[] args) {
//        String path="C:\\Users\\ACER\\OneDrive\\Desktop\\Demo.csv";
//        File file=new File("C:\\Users\\ACER\\OneDrive\\Desktop\\Demo.csv");
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader("C:\\Users\\ACER\\OneDrive\\Desktop\\Demo.csv"));
        }catch (Exception e){
            System.out.println("File Not Found");
        }
        String line;
        while (true){
            try {
                if (!((line=br.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
    }
}

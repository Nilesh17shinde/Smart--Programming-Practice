package CollectionFramework.ListCollection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector=new Vector();
            vector.add(10);
            vector.add(10);
            vector.add(20);
            vector.addElement("Deva");
            vector.addElement("Shraddha");
            vector.add("Nilesh");
            vector.addElement(98);
        System.out.print(vector+" ");
        System.out.println();
        /*Enumeration enumeration=vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");
        }*/
        System.out.println("------------------------------------------------------------  ");
        System.out.println(vector.contains("Deva"));
        vector.removeElement(10);
        System.out.print(vector+" ");
        System.out.println();
        System.out.print(vector.capacity());
        System.out.println("------------------------------------------------------");
        vector.forEach(e->{
            System.out.print(e+" ");
        });
    }
}

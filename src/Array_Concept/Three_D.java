package Array_Concept;

public class Three_D {
    public static void main(String[] args) {
        int [][][]a={{{10,20,30},{40,50,60},{70,80,50,10},{10,58,98,60}}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

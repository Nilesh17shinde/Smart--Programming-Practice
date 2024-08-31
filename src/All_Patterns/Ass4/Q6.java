package All_Patterns.Ass4;

public class Q6 {
//    public static void main(String[] args) {
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i==1 | j==1 | i==n | j==n){
//                    System.out.print("*");
//                }else {
//                    System.out.print(j+i);
//                }
//            }
//            System.out.println();
//        }

//    public static void main(String[] args) {
//        String s="RSL Solution pvt ltd";
//        String res = " ";
//        for(int i=0;i<s.length();i++)
//        {
//            char ch = s.charAt(i);
//            if(ch==' ')
//            {
//                res=res+'.';
//            }
//            else {
//                res=res+ch;
//            }
//        }
//        System.out.println(res);
//    }
public static void main(String[] args) {
    int n=5;
    for (int i=0;i<=n;i++){
        for (int j=0;j<i;j++){
            System.out.print(" ");
        }
        for (int k=1;k<=n-i;k++){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
}

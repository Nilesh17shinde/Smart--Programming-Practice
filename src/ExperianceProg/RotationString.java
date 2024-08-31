package ExperianceProg;

public class RotationString {
    public static void main(String[] args) {
        String str="ABCD";
        String str1="CDAB";
        if (isRotation(str,str1)){
            System.out.println("Rotation on string is present");
        }else {
            System.out.println("Rotation of string is not present");
        }
    }
    public static boolean isRotation(String str,String str1){
        return (str.length()==str1.length())&&((str+str1).indexOf(str1)!=-1);
    }
}

package InterviewJava_2024;

public class RotationString {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="DCBA";
        if (isRotation(str1, str2)){
            System.out.println("Rotation of String is present");
        }else {
            System.out.println("Not Present");
        }
    }

    public static boolean isRotation(String str1, String str2){
        return (str1.length()==str2.length()) && ((str1 + str1).contains(str2));
    }
}

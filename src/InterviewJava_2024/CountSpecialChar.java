package InterviewJava_2024;

public class CountSpecialChar {
    public static void main(String[] args) {
        String str="Nilesh#@ Shinde!";
        int count=0;
        String specialCharRemoved="";
        String specialChar="";
        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))){
                specialChar=specialChar+str.charAt(i);
                count++;
            }else {
                specialCharRemoved=specialCharRemoved+str.charAt(i);
            }
        }
        if (count==0){
            System.out.println("There is Not Special Character Found");
        }
        else {
            System.out.println("Special Character Count is "+count + " & Characters is "+specialChar);
        }
        System.out.println("After Removed Special Character: "+specialCharRemoved);
    }
}

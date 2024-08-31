package ExperianceProg;
//WAP to count the special character from the given String
public class CountSpecialChar {
    public static void main(String[] args) {
        String str="SNInfotech@#$&&";
        int count=0;
        int count1=0;
        for (int i = 0; i <str.length() ; i++) {
            if(!Character.isDigit(str.charAt(i))&&
            !Character.isLetter(str.charAt(i)) &&
            !Character.isWhitespace(str.charAt(i))){
                count++;
            }else {
                count1++;
            }
        }
        if (count==0){
            System.out.println("Character Count is: "+count1+" there is Not special characters");
        }else {
            System.out.println("Special character is: "+count);
        }
    }
}

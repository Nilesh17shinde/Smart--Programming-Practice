package ImportantProgram;
//Remove All given Character from a string
public class RemoveCharacter {
    public static void main(String[] args) {
        String str="SnInfotechts";
//        System.out.println(str.replaceAll("s",""));
        char ch='s';
        System.out.println(str.replaceAll("(?i)"+ch,""));

//        removeCharacter(str,ch);
    }

//    private static void removeCharacter(String str, char ch) {
//        String result="";
//        char lowerCaseCh=Character.toLowerCase(ch);
//        for(int i=0;i<str.length();i++){
//            if(Character.toLowerCase(str.charAt(i))!=lowerCaseCh){
//                result+=str.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
}

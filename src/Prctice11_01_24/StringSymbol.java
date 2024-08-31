package Prctice11_01_24;

public class StringSymbol {
    public static void main(String[] args) {
        String originalString = "Ni&le,s@h";
        char[] characters = originalString.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Skip symbols on the left side
            while (left < right && !Character.isLetterOrDigit(characters[left])) {
                left++;
            }

            // Skip symbols on the right side
            while (left < right && !Character.isLetterOrDigit(characters[right])) {
                right--;
            }

            // Swap alphanumeric characters
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        String reversedString = new String(characters);
        System.out.println(reversedString);
    }
}


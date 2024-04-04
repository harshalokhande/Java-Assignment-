package winsoft;

// Write a Java Program to find the duplicate characters in a string.


public class assignment4 {
    public static void main(String[] args) {
        String str = "Engineering";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
    
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
    
            if (charArray[i] != '\0') {
                int count = 1;

                for (int j = i + 1; j < charArray.length; j++) {
 
                    if (charArray[i] == charArray[j]) {
                        count++;

                        charArray[j] = '\0';
                    }
                }

                if (count > 1) {
                    System.out.println("'" + charArray[i] + "' - " + count + " times");
                }
            }
        }
    }
}

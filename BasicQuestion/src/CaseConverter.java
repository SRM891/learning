public class CaseConverter {
    public static void main(String[] args) {
        char[] characters = {'a', 'M', 'z', 'T'};

        System.out.println("Character Conversion:");
        for (char ch : characters) {
            char convertedChar;
            if (Character.isUpperCase(ch)) {
                convertedChar = Character.toLowerCase(ch);
                System.out.println(ch + " -> " + convertedChar);
            } else if (Character.isLowerCase(ch)) {
                convertedChar = Character.toUpperCase(ch);
                System.out.println(ch + " -> " + convertedChar);
            } else {
                System.out.println(ch + " -> Not an alphabet character");
            }
        }
    }
}

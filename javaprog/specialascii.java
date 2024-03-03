public class specialascii {
    public static void main(String[] args) {

        char[] specialCharacters = { '$', '#', '@', '%', '&', '?' };

        for (char ch : specialCharacters) {
            int asciiValue = (int) ch;
            System.out.println("Character: " + ch + ", ASCII Value: " + asciiValue);
        }
    }
}

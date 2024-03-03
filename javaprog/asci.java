public class asci {
    public static void main(String[] args) {
        System.out.printf("%-8s %-10s %s%n", "Decimal", "ASCII", "Hex");

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int asciiValue = (int) ch;
            String hexValue = Integer.toHexString(asciiValue);
            System.out.printf("%-8d %-10c %s%n", asciiValue, ch, hexValue);
        }
    }
}

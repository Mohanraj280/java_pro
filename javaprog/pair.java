public class pair {
    public static void main(String[] args) {
        int[] input = { 2, 4, 3, 3, 4, 4 };
        int sum = 6;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (j != i && (input[i] + input[j]) == sum) {
                    System.out.println("Pair: (" + input[i] + ", " + input[j] + ")");
                }
            }
        }
    }
}

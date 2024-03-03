import java.util.HashMap;

public class unique {
    public static void main(String[] args) {
        int[] arrayWithDuplicates = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int j = 0; j < arrayWithDuplicates.length; j++) {
            hashmap.put(arrayWithDuplicates[j], j);
        }

        System.out.println(hashmap.keySet());
    }
}

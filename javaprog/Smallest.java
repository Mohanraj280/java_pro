import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();

		List<Integer> list2 = new ArrayList<>();

		List<Integer> mergedlist = new ArrayList<>();

		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			list1.add(s.nextInt());
		}

		int m = s.nextInt();
		for (int j = 0; j < m; j++) {
			list2.add(s.nextInt());
		}

		mergedlist.addAll(list1);
		mergedlist.addAll(list2);
		Collections.sort(mergedlist);
		System.out.print(mergedlist);
	}
}
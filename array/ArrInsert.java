package array;

import java.util.*;

class ArrInsert {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		for (int v : arrlist)
			System.out.print(v + " ");

		System.out.println("Enter the position and element");
		int pos = s.nextInt();
		int elem = s.nextInt();
		int n = arrlist.size();
		arrlist.add(pos, elem);

		arrlist.set(pos, elem);
		for (int v : arrlist)
			System.out.print(v + " ");

	}
}
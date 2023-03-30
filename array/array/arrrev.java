package array;

import java.util.*;

class arrrev {
    public static void main(String args[]) {
        int arr[] = { 3, 5, 9, 4, 2 };
        int first = 0;
        int last = arr.length - 1;
        int temp;

        while (first != last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            System.out.println("swapped" + arr[first] + arr[last]);
            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
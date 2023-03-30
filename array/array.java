package array;

import java.util.Scanner;

class array {
    public static void main(String args[]) {
        System.out.println("Enter the size of the array");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the the array elements");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.println("The array elements are ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println("Enter the value of element to be inserted");
        int ele = s.nextInt();

        arr[n] = ele;

        System.out.println("The array elements are ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}
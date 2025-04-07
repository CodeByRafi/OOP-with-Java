// Task 1: Find the maximum and minimum elements in an array.
// Sample Input: [ 5, 3, 9, 2, 1, 7 ]
// Output: Maximum: 9
// Minimum: 1

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxVal = arr[0], minVal = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxVal) maxVal = arr[i];
            if (arr[i] < minVal) minVal = arr[i];
        }

        System.out.println("Maximum: " + maxVal);
        System.out.println("Minimum: " + minVal);

        scanner.close();
    }
}

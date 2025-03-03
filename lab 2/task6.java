import java.util.Scanner;

class task6 {
    
    public static void moveZeroes(int[] arr) {
        int nonZeroIndex = 0;  // To keep track of the position to place non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];  // Place the non-zero element at the correct position
            }
        }

        // Fill remaining array positions with 0s
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;  // Place zero at the end
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Take array input
        }

        // Move zeroes to the end
        moveZeroes(arr);

        // Print the modified array
        System.out.print("Modified Array: [ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        scanner.close();
    }
}

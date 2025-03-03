import java.util.Scanner;
public class task2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] reversedArr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        // Reverse and store in a new array
        for (int i = 0; i < n; i++) 
        {
            reversedArr[i] = arr[n - 1 - i];
        }
        System.out.print("Reversed Array: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println("]");

        scanner.close();
    }
}

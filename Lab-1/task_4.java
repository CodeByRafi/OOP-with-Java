import java.util.Scanner;

public class task_4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        if (isPrime(n)) 
        {
            System.out.println(n + " is a prime number.");
        } 
        else 
        {
            System.out.println(n + " is not a prime number.");
        }
        
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) 
        {
            return false; 
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}

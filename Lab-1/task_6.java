public class task_6 {
    public static void main(String[] args) 
    {
        int n = 25; 
        System.out.println("The 25th Fibonacci number is: " + findFibonacci(n));
    }

    public static int findFibonacci(int n) 
    {
        if (n <= 0) 
        {
            return 0; 
        } 
        else if (n == 1 || n == 2) 
        {
            return 1; 
        }

        int prev1 = 1, prev2 = 1, current = 0;
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2; 
            prev2 = prev1; 
            prev1 = current; 
        }
        return current;
    }
}

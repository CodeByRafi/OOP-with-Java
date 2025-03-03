import java.util.Arrays;
public class task3 {

    public static int remove(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
      
          // Sort the input array
          Arrays.sort(a);

        // create another array for only storing
        // the unique elements
        int[] t = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                t[j++] = a[i];
            }
        }

        // Adding last element to the array
          t[j++] = a[n-1];
          
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = t[i];
        }
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 3, 1, 4, 2, 1, 5 };
        int n = a.length;
        n = remove(a, n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

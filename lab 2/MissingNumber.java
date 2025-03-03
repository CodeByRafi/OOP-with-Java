import java.util.*;
class MissingNumber {
    public void m(int[] arr,int n) 
    {
       for(int i=0;i<n;i++)
       {
        if(i+1 != arr[i])
        {
            System.out.print(i+1+" ");
            break;
        }
       } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];  
        for(int i=0;i<n;i++)
        {
            arr[i] = 0;
        }
        for(int i=0;i<n-1;i++)
        {
            arr[i] = sc.nextInt();
        }
         MissingNumber nn= new MissingNumber();
         nn.m(arr,n);
         sc.close();
    }
}

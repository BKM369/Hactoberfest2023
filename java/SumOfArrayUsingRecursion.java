import  java.util.*;
public class SumOfArrayUsingRecursion {
    static int func(int n,int arr[]){
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=arr[i]+sum;
        }
        return sum;
    }
    public static void main(String args[])
    {
      Scanner S=new Scanner (System.in);
      int n=S.nextInt();
      int arr[]=new int[5];
      for(int i=0;i<n;i++)
      {
          arr[i]=S.nextInt();
      }
      int res=func(n,arr);
      System.out.println(res);
    }
    
}
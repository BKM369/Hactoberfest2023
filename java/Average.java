import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of lines: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the number: ");
            arr[i]=s.nextInt();
            total=total+arr[i];
        }
        System.out.println("the average of five number is: "+ total/n);

    }
}
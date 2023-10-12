import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a=s.nextInt();
        System.out.print("enter the second number: ");
        int b=s.nextInt();
   int Result=Divide(a,b);
        System.out.println("result: "+Result);
}
static int Divide(int dividend,int divisior){
        int quetient=-1;
        try{
            quetient=dividend/divisior;
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
        }
        finally {
            if(quetient!=-1){
                System.out.println("result: "+quetient);
            }
            else{
                System.out.println("Exception occur");
            }
        }
        return quetient;
}
}
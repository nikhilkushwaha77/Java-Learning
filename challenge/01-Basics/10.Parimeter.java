import java.util.Scanner;

class Parameter {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to a parameter calculator ");
       System.out.print("please Enter your 4 parameter number = ");
       double a = input.nextInt();
       double b = input.nextInt();
       double c = input.nextInt();
       double d = input.nextInt();

       double sum = a+b+c+d;

       System.out.println(sum);


   }
}

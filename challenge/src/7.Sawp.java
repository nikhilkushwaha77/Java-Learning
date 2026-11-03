import java.util.Scanner;

class Sawp {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcame to sawp program :\n\n ");
        System.out.print("Enter a value A : ");
        int a = input.nextInt();
        System.out.print("Enter a value B : ");
        int b = input.nextInt();
        System.out.print("Enter a value C");
        int c = input.nextInt();


        int Demo = a;
        a = c;
        c = b;
        b = Demo;

        System.out.println("Sawping is Done...");
        System.out.println("Enter a value A = " + a);
        System.out.println("Emter a value B = " + b);
        System.out.println("Enter a value c = " + c);





    }
}



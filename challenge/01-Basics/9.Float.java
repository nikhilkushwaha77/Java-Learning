import java.util.Scanner;

class Float {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Float Number \n ");
        System.out.print("Enter First Number : ");
        float first = input.nextFloat();
        System.out.print("Enter Second Number : ");
        float second = input.nextFloat();

        float sum = first + second;
        System.out.println("\nResult is..." + sum);




    }
}

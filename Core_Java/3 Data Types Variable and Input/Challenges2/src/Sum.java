import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        System.out.println("Sum of Tow no");
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
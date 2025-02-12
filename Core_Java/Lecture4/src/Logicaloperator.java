import java.util.Scanner;

public class Logicaloperator {
    public static void main(String[] args) {
        System.out.println("Welcome to Ticket Discount Counter");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter your age: ");
        int age = sc.nextInt();
        System.out.println("Are you a feamale? (true/false) ");
        boolean isfemale = sc.nextBoolean();

        if(age<5){
            System.out.println("You got 75% discount");
        }else if(isfemale){
            System.out.println("You got 50% discount");
        }else if(age>60 && !isfemale){
            System.out.println("You got 25% discount");
        }else{
            System.out.println("You got no discount");
        }
    }
}

import java.util.Scanner;

public class Relationaloperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.println("please enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for driving Bike");
        }else{
            System.out.println("You are not eligible for driving Bike");
        }
    }
}

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("using while loop");
        int n = 1; //initialization
        while(n<100){ // condition
            System.out.println(n); //actual work
            n = n+1; // updating value
        }

        int num = 500;
        while(num>=200){
            System.out.println(num);
            num= num-1;
        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i<5){
            System.out.println("Enter number 5 times: ");
            int inp = input.nextInt();
            i++;
        }

    }
}

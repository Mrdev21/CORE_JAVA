import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4, 5, 67, 87, 45, 34, 23, 90};
        System.out.println("Welcome to Array Searching");
        System.out.println("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Your Number was found in the Array");
        }else{
            System.out.println("Your Number was not found in the Arra");
        }


    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index<arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}

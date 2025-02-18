public class Parameter {
    public static void main(String[] args) {
        int num = SumTwoNumber(3, 6);
        System.out.println(num);
    }

    public static int SumTwoNumber(int a, int b) {
        System.out.println("First No recived: "+ a);
        System.out.println("Second No recived: "+ b);
        int sum = a + b;
        return sum;
    }
}

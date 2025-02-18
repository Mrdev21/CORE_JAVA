public class Function {
    public static void main(String[] args) {
        System.out.println("Good Morning");
        greeting();
        whileLoop();
        System.out.println("Thankyou");
    }

    public static void greeting(){
        System.out.println("Hello World");
    }


    public static void whileLoop(){

        int row =0;
        while(row<5){
            System.out.print("*");
            int i =0;
            while (i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

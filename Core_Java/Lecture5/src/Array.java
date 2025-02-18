public class Array {
    public static void main(String[] args) {
//        int[] myArray = new int[5];
//        myArray [0] = 98;
//        myArray [1] = 23;
//        myArray [2] = 35;
//        myArray [3] = 49;
//        myArray [4] = 54;

        int[] myArray = {86, 76, 56, 34, 51};
//        int index = 2;

//        System.out.println(myArray[0]);
//        System.out.println(myArray[1]);
//        System.out.println(myArray[4]);
//        System.out.println(myArray[3]);
//        System.out.println(myArray[index]);

        // Array Traversal
        int index = 0;
        while(index < myArray.length){
            System.out.println(myArray[index]);
            index++;
        }

        String[] strArr = new String[4];
        strArr[0] = "Hello";

        String[] strArr2 = {"Hello", "Mr", "Himanshu"};
        System.out.println(strArr2.length);


    }
}

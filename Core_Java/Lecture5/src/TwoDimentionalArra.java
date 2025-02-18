public class TwoDimentionalArra {
    public static void main(String[] args) {

//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(myarr[0].length);

        int i = 0;
        while(i<arr.length){
            int j = 0;
            while(j<arr.length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr= new int [3][3];
        int[] arr2={1,2,5,8,9,9};

        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       String[] arr= new String[4];
       String names;
       arr[0]= "fd";
       for(int i=0;i<4;i++){
           Scanner in = new Scanner(System.in);
           System.out.println("Enter The names");
           names=in.nextLine();
           arr[i]=names;


       }
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }



    }
}

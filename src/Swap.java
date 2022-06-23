import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Original Input a= "+a + " b= "+b);
        swap(a,b);
    }
    static void swap(int a,int b){
         //a=10,b=20;
        a=a+b; //30
        b=a-b; //10
        a=a-b; //20
        System.out.println("After Swapping the value of a= "+ a + " and b= "+ b);
    }
}

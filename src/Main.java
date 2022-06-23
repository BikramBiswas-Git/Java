import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(a);
//
//        int flag=1;
//        for (int i=2;i<a;i++){
//            if(a%i==0){
//                flag=0;
//            }
//
//        }
//        if(flag==0) {
//            System.out.println("Not Prime");
//        }
//        else
//        {
//            System.out.println("Prime");
//        }
//        }
//        float a=(int)(212.44324f);
//        System.out.println(a);

//        int a,b;
//        String op;
//        Scanner in = new Scanner(System.in);
//        System.out.println("please give two numbers ");
//        a=in.nextInt();
//        b=in.nextInt();
//        System.out.println("Please give the operator");
//        op= in.next();
//        System.out.println(op);
//        if((op.equals("+"))){
//            System.out.println(a+b);
//        }
//        else if((op.equals("-"))){
//            System.out.println(a-b);
//        }
//        else if((op.equals("*"))){
//            System.out.println(a*b);
//        }

//        int a=0,b=1;
//        int n;
//        System.out.println("Enter the number");
//        Scanner in=new Scanner(System.in);
//        n=in.nextInt();
//        for(int i =0;i<n;i++){
//            System.out.print(a +" "+ b);
////            a=b+a;
////            b=b+b;
//        }
//
//        int a=10,b=20;
//        if(a==1 || b==20){
//            System.out.println("Hello");
//        }
//Fibonacci
//        int a=0,b=1,len=7;
//
//        for (int i = 2; i <=len; i++) {
//         int temp=b;
//         b=b+a;
//         a=temp;
//            System.out.print(b + " ");
//        }

        //times a number is occurring
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter the number ");
//        int n=in.nextInt();
//        System.out.println("type the number you want to search");
//        int number = in.nextInt();
//        int count=0;
//        while (n>0){
//            int rem=n=n%10;
//            if(rem==number){
//                count++;
//            }
//            n=n/10;
//        }
//        System.out.println("The Number " + n + "occureed " + count + " times ");
        //Reverse a number
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0;
        while (n > 0) {
            int rem = n % 10;
            ans=(ans*10)+rem;
            n=n/10;

        }
        System.out.println(ans);

    }
}


import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {

String ans=greet("bikram");
        System.out.println(ans);
    }
    static int sum(){
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two Numbers  :-");
        a= in.nextInt();
        b= in.nextInt();
        int sum=a+b;
        return sum;
    }
    static String greet(String name){
        String greet="Hello " + name;
        return greet;
    }
}


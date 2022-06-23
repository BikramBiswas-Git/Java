import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       over("sssx","Bikram",2);
    }
    static void fun(int a , int b, int...c){
        System.out.println(Arrays.toString(c));
    }
    static void over(int a, String b, int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void over(String a, int b, String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void over(String a, String b, int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

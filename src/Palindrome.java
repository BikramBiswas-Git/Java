import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=in.nextInt();
        int ans=0;int temp=n;

        while (n > 0) {
            int rem = n % 10;
            ans=(ans*10)+rem;
            n=n/10;
        }
        if(ans==temp) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not");
        }
    }
}

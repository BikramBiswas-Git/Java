import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter The Number:=");
        int n=in.nextInt();
        int flag=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if (flag==1){
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}

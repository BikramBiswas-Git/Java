import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean isArmstrong =arm(n);
//        System.out.println(isArmstrong);
        for(int i =10000;i<99999;i++){
            if(arm(i)==true){
                System.out.println(i);
            }

        }
    }

    static boolean arm(int n) {
        int rem,cube,sum=0,temp=n;
        while(n>0) {
            rem = n % 10;
            cube = rem * rem * rem*rem*rem;
            sum = sum + cube;
            n=n/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }
}

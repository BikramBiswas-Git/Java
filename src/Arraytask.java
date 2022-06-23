import java.util.Scanner;

public class Arraytask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums =new int[3];
        int[] ans=new int[nums.length*2];
        System.out.println(ans.length);
        for (int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        for(int i=nums.length;i<ans.length;i++){
            int j=0;
            ans[i]=nums[j];
            System.out.println(ans[i]);
            System.out.println(nums[j]);
            j++;

        }
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        for(int i=nums.length;i<ans.length;i++){
            System.out.print(ans[i]);

        }


    }
}

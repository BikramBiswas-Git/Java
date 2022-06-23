import java.util.Arrays;

public class ClassesAndObjectsDemo {

    public static class Students{
        int rNo=1;
        String name;
    }
    public static void main(String[] args) {
        Students[] no=new Students[5];
        System.out.println(Arrays.toString(no));
    }
}

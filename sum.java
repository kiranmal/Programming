import java.util.*;

public class sum {
    public static int sumOfTwoNumber(int a, int b) {
        int add = a + b;
        System.out.println(add);
        return add;
    }

public static void main(String[] args) {
    System.out.println("Enter two Number to print sum of them");
    Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
    
int b=obj.nextInt();
sumOfTwoNumber(a, b);
}
}
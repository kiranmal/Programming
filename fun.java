import java.util.*;

public class fun {
    public static int mulNum(int a, int b) {
        int  mulNum1= a * b;
        System.out.println(mulNum1);
        return mulNum1;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of two Number is:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        mulNum(a, b);
    }
}
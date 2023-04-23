import java.util.Scanner;

public class greatestDivisor {
    

    public static void divisorOfTwo(int x, int n) {
        int gcd = 1;

        for (int i = 1; i <= x && i <= n; i++) {
            if (x % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
       
        int x=sc.nextInt();
        int n=sc.nextInt();
        divisorOfTwo(x,n);
    }
}

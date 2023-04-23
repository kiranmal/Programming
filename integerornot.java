import java.util.Scanner;

public class integerornot{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        // int n =sc.nextInt();
        System.out.println(sc.hasNextInt());
    }
}
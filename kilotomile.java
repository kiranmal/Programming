import java.util.Scanner;

public class kilotomile {
    public static void main(String[] args) {
        System.out.println("Enter a value to convert km to Miles");
        Scanner sc=new Scanner(System.in);
        float km =sc.nextFloat();
        km*=0.621371;
        System.out.println(km+"Miles");
    }
}

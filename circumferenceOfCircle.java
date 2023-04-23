import java.util.Scanner;

public class circumferenceOfCircle{
    public static void circum(int r){
        double cir;
        double pi=3.14;
        cir=2*pi*r;
        System.out.println(cir);
    }
    public static void main(String[]args){
        // int r;
        System.out.println("Enter your value");
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        circum(r);

    }
}
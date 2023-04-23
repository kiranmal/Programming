import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        float cal=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subject to taken out your percentage");
        int a = sc.nextInt();
        int  b= sc.nextInt();
        int c= sc.nextInt();
        int  d= sc.nextInt();
        int  e= sc.nextInt();
       
         cal=(a+b+c+d+e)*100;
        cal=cal/500;
        System.out.println(cal);
    }
}

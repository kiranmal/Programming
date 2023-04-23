import java.util.Scanner;

public class so {
    public static void main(String[] args) {float sum=0;
       System.out.println("Enter your marks to convert in cgpa");
       Scanner sc=new Scanner(System.in);
       System.out.println("A : ");
        int A = sc.nextInt();
        System.out.println("B : ");
        int B= sc.nextInt();
        System.out.println("C: ");
        int C = sc.nextInt();
        sum=(((A+B+C)*100)/300);
        sum*=(sum/10)9.8;
        System.out.println(sum);
        
    }
}

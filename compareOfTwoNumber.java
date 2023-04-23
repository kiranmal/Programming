import java.util.Scanner;

public class compareOfTwoNumber {
   
    public static void checkEquals(int a, int b) {
        
        if(a==b ){
            System.out.println("They are equal");
        }
        else{
            System.out.println("Not equal");
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter two nos for comparison");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        checkEquals(a,b);
       
    }
}


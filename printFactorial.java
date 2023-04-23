import java.util.Scanner;

public class printFactorial {

    public static int printfact(int n) {
    
    if(n==0 || n==1){
        return 1;
    }
   int cal_Fact=printfact(n-1);
   int fact =n * cal_Fact;
   return fact ;
   
    }
    public static void main(String[] args) {
        System.out.println("Enter the digit n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = printfact(n);
        System.out.println(ans);
    }
  ;
}
//     if(n < 0){
    //         System.out.println("Invalid Input");
    //     }
    //      int factorial = 1;
        
    //     for (int i = n; i >= 1; i--) {
    //           factorial = factorial * i;
    // }
    // System.out.println(factorial);
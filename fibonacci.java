// import java.util.Scanner;

public class fibonacci {
public static void print_Fib(int a, int b, int n){
    if(n==0)
    return;
    int c=a+b;
    System.out.println(c);
    print_Fib(b, c, n-1);
}
public static void main(String[] args) {
    int a = 0, b = 1;
    System.out.println(a);
    System.out.println(b);
    int n=5;
    print_Fib(a, b, n-2);
}
}
    
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // int a=0,b=1;
    // System.out.println(a+" ");
// if(n>1){
//     for(int i=2;i<=n;i++){
//         System.out.println(b+" ");
//         int temp=b;
//         b=a+b;
//         a=temp;
//     }
//     System.out.println();
// }



//     }
// // }

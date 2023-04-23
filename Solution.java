import java.util.Scanner;

public class Solution {
   public static void power(int x,int n){
    int result=1;
for(int i=0;i<n;i++){
   
   result=result*x;

   }
   System.out.println(result);
}
public static void main(String[] args) {
    System.out.println("Enter the x");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    System.out.println("Enter the value for n");
    int n=sc.nextInt();
power(x, n);
}
}
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
    //     int a = 10;
    //     if( a == 11){
    //     System.out.println("I am 11");
    // }
    // else{
    //     System.out.println("I am not 11");
    // }
    // System.out.println("Enter the marks of 3 subject");
    // Scanner sc=new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // int c=sc.nextInt();
    // float avg= (a +b +c)/3.0f;
    // if(avg>=40 && b>=33 && c >= 33 && a>= 33){
    // System.out.println("congralution you are promoted");
    // }
    // else{
    //     System.out.println("Sorry, you are failed");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your in lakhs per annum");
     float income=sc.nextFloat();
    // float income= 3.3f;
    float tax=0;
if(income <=2.5){
    tax=tax+0;
}
else if(income >2.5f && income <= 5f){
    tax = tax + 0.05f * (income - 2.5f);
}
else if(income > 5f && income <= 10f){
    tax =tax + 0.05f * (5.0f- 2.5f);
    tax= tax + 0.02f * (income -5f); 
}
else if(income >10.0f ){
    tax =tax + 0.05f * (5.0f- 2.5f);
    tax= tax + 0.02f * (10.0f-5.0f); 
    tax = tax + 0.03f * (income -10.f);

}
System.out.println(tax);
    }
}


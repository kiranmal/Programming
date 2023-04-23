import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Strings {
    public static void main(String[] args) {
//         System.out.println("Enter a number 1-7");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
// if(n==1){
//     System.out.println("Monday");
// }
// else if(n==2){
//     System.out.println("Tuesday");
// }
// else if(n==3){
//     System.out.println("Wednesday");
// }
// else if(n==4){
//     System.out.println("Thrusday");
// }
// else if(n==5){
//     System.out.println("Friday");
// }
// else if(n==6){
//     System.out.println("Saturday");
// }
// else if(n==7){
//     System.out.println("Sunday");
// }
//    else{
//     System.out.println("invalid number");
//    }     
System.out.println("Enter a wevsite you want to see the type");
Scanner sc =new Scanner(System.in);
String a=sc.nextLine();
if(a.endsWith(".org")){
    System.out.println("is an organization");
    
}
else if(a.endsWith(".com")){
    System.out.println("is an commericial");
}
else if(a.endsWith(".in")){
    System.out.println("is an Indian Website");
}
    }
    
}

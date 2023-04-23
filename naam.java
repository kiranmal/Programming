import java.util.Scanner;

public class naam {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    String names[]=new String[x];
    //input
for(int i=0;i<x;i++){
    names[i]=sc.nextLine();
}
//output
for(int i=0;i<names.length;i++){
    System.out.println(names[i]);
}


   }
}
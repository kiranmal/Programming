import java.util.Scanner;

public class dowhile {
    public static void does(int a){
        int i=0;
        do{
            System.out.println("You are monkey");
           
           i++;
        }
        while(i>a);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number here: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        does(a);
    }
}

import java.util.Scanner;

public class voteCount {
    public static void voters(int age){      
        if(age >= 18){
            System.out.println("Eligible to give votes");
        }
        else{
            System.out.println("Fail to donate for votes");
        }
    }
public static void main(String[] args) {
    System.out.println("Please enter your age here: ");
    Scanner sc= new Scanner(System.in);
    int age = sc.nextInt();
    voters(age);
}
    
}

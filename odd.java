import java.util.*;

public class odd {
    public static void main(String args[]) {
        
        System.out.println("Enter the value to see its odd or not");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int i=1;i<=n;i++){
            if(i%2!=0)
            {
            System.out.println(i + " ");
            }
        }

    }

}

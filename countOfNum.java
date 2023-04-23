import java.util.Scanner;

public class countOfNum {
    int count_n = 0, count_p = 0, count_z = 0;
    public static void count(int a){
        for(int i=0;i<=a;i++){
            for(int i=0;i<=a;i++){
                
if(a == 0){
    count_z++;
}
else if(a <= 0){
    count_n++;
}
else if(a >=0){
    count_p++;
}
else{
    System.out.println("Wrong Input");
}
System.out.println("Do you want to continue y/n?");
choice = sc.next().charAt(0);
        }
        if(choice=='y'||choice=='n');
        System.out.println("postive Numbers:"+count_p);
        System.out.println("negtive Number"+count_n);
        System.out.println("zero"+count_z);

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
       

    }
}

    

    
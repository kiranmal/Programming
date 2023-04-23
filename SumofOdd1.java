
import java.util.Scanner;

public class SumofOdd1{
	
	public static void printoddSum
	(int a){
		int oddSum =1;	for(int i=2;i <=a ;i++){
		if(i % 2== 1){
			oddSum = oddSum+ i;
		}
		System.out.println("output is:"+oddSum);
		
	}
	return;
}
public static void main(String[] args) {
	System.out.println("Enter a NUmber");
	Scanner sc= new Scanner(System.in);
	int a = sc.nextInt();
printoddSum(a);
}
}
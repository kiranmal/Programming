import java.util.Scanner;

public class averageNum{
    public static float averageNum(float a, float b, float c){
        
        // float sum = a + b + c;
        float avg = (a+ b+ c)/3;
        return avg;
    }

public static void main(String[] args) {
    System.out.println("Enter 3 nos to find avg of them");
    Scanner s=new Scanner(System.in);
    float a=s.nextFloat();
    float b=s.nextFloat();
    float c=s.nextFloat();

    float avg = averageNum(a,b,c);
   System.out.println("Average is "+avg);
}
}
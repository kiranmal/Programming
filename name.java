import java.util.Scanner;

public class name {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        printMyName(name);
    }
}

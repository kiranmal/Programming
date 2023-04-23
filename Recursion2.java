public class Recursion2 {
    public static void print1_Last(String str,int idx){
         if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
System.out.println(str.charAt(idx));
print1_Last(str, idx-1);
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        print1_Last(str, str.length()-1);
    }
    // public static void printRev(String str,int idx){
    //     if(idx==0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.println(str.charAt(idx));
    //     printRev(str,idx-1);
    // }
    // public static void main(String[] args) {
    //     String str = "abcd";
    //     printRev(str, str.length()-1);
    // }
}

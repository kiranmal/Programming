public class backtracking {
    public static void printPermuation(String str,String Perm,int idx){
        for (int i = 0; i < str.length(); i++) {
           char currChar=str.charAt(i) ;
           String newstr=str.substring(0,i)+str.substring(i+1);
           printPermuation(newstr, Perm+currChar,idx+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPermuation(str, " ", 0);
    }
}

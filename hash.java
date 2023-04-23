import java.util.HashSet;

public class hash {
    public static void subsequence(String str,int idx,String newString,HashSet<String>allsubsequence){
        if(idx==str.length()){
            if(set.contains(newString))
            return;
            else{
                System.out.println(newString);
                set.add(newString);
            }
        }
        char currChar = str.charAt(idx);
        subsequence(str, idx+1, newString+currChar,set);
        subsequence(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str=("abc");
HashSet<String> set= new HashSet<>();
        subsequence(str, 0, " ", set);
    }
}

public class removeDuplicate {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str,int idx,String newString){
     char charCurr= str.charAt(idx);
     if(map[charCurr - 'a']){
 removeDuplicate(str, idx-1, newString);
     }else{
        newString+=charCurr;
        map[]
     }
    }
}

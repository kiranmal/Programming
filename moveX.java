public class moveX {
public static void moveAll(String str,int count,int idx,String newString){
    if(idx==str.length()){
        for(int i=0;i<count;i++){
            newString +='x';
        }
        System.out.println(newString);
        return;
    }
char currChar =str.charAt(idx);
if(currChar == 'x' ){
    count++;
moveAll(str, count,idx +1, newString);
}else{
    newString+=currChar;
    moveAll(str, count, idx+1, newString);
}
}
public static void main(String[] args) {
    String str="axbcxxd";
    moveAll(str, 0, 0, " ");
}
}



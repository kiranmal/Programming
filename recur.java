public class recur {
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
if(arr[idx]<arr[idx+1]){
    return isSorted(arr,idx+1);
}else{
    return false;
}
}
public static void main(String[] args) {
    int arr[] = {1,3,2};
    System.out.println(isSorted(arr, 0));
}
    }
//     public static int first=-1;
//     public static int last=-1;
//     public static void findOccurence(String str,int idx,char element){
//         if(idx == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(idx);
//     if(currChar == element){
//         if(first==-1)
//         {
//             first=idx;
//         }
//             else{
//                 last=idx;
//             }
        
//     }
// findOccurence(str, idx+1, element);
//     }

//     public static void main(String[] args) {
//         String str = "abaacdaefaah";
//         findOccurence(str, 0,'a' );
//     }


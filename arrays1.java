public class arrays1{
    public static void main(String[] args) {
//     // int []a=New int[5];
//     // int a[]={6,7,8,9,10};
//     // for(int i=4;i>=0;i--){
//     //     System.out.println(a[i]);
//     // }
//     // for(int i:a){
//     //     System.out.println(i);
//     // }
//     // Sum of 5 float values
// //     float sum=0f;
// //     float arr[]={1,2,3,4,5};
// // for(float i:arr){
// //     System.out.println(i);
// //     sum+=i;
// // }
// // System.out.println("the sum is"+sum);
// int arr[]={4,5,6,7,8,9};
// int x=5;
// // for(int i:arr){
// //     System.out.println(i);
// //     if(x==arr[i])
// //         System.out.println(i);
// //     }
// // for(int i=0;i<arr.length;i++){
// // if(x==arr[i])
// // {//linear search for a single element by for loop
// //     System.out.println(i);
// // }
// // }
// // marks of student in array and find out for each loop
// // float sum=0f;
// // float marks_in_physics[]={88f,99f,100f,54f,68f,69f};
// // for(float i:marks_in_physics){
// //    sum =+ i;
// // }
// // System.out.println("the average "+sum/marks_in_physics.length);
// int [][] a ={{1,2,3},{4,5,6}};
// int [][] b ={{2,6,13},{3,7,1}};
// int [][] c ={{0,0,0},{0,0,0}};
// for(int i=0;i<2;i++){
//     for(int j=0;j<3;j++){
//         System.out.println(" ");
//         c[i][j]=a[i][j]+b[i][j];
//     }
    
// }
// for(int i=0;i<2;i++){
//     for(int j=0;j<3;j++){
//         System.out.println(c[i][j]);
//         c[i][j]=a[i][j]+b[i][j];

// }
// System.out.println(" ");
// }
// int l=arr.length;
// int n=Math.floorDiv(l,2);
// for(int i=0;i<n;i++){
    //     int temp=arr[i];
    //     arr[i]=arr[l-i-1];
    //     arr[l-i-1]=temp;
    
    // }
    // for(int i:arr){
        //     System.out.println(i+" ");
        // }
//         int []arr={5,6,9,8,12};
//         int max=Integer.MIN_VALUE;
// for(int i:arr){
//     if(i > max){
//         max=i;
//     }
// }
    // System.out.println("Maximum value is"+max);
// System.out.println(Integer.MIN_VALUE);
// System.out.println(Integer.MIN_VALUE);
boolean isSorted=true;
int arr[]={5,6,9,8,7,1,2,3,4};
for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
        isSorted=false;
        break;
    }}
    if(isSorted){
        System.out.println("The ");
    }
    else{
        System.out.println("not sorted");
    }
}
}

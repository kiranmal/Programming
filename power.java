public class power {
public static int pw(int x,int n){
    if(n == 0)
    return 1;
    if(x==0)
    return 0;
    if(n % 2 == 0){
     return pw(x,n/2) * pw(x, n/2);
    }
    else{
        return pw(x,n/2)* pw(x,n/2) * x;
    }

}
public static void main(String[] args) {
    int x=2;
    int n=3;
    int ans = pw(x,n);
    System.out.println(ans);
    
}

}
//   int  xPownm1 = pw(x,n-1);
//   int xPown = x * xPownm1;
//   return xPown;

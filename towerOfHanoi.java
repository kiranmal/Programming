public class towerOfHanoi {
    public static void towerOfH(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk"+n +"from" +src+ "to"+dest);
            return;
        }
        towerOfH(n-1,src,dest,helper);
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
        towerOfH(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfH(n, "S", "H", "D");
    }
}

import java.util.Scanner;

public class arrin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
matrix[i][j]=sc.nextInt();
            }
        }
System.out.println("The spiral order Matrix is: "
);
int arow=0;
int brow=n-1;
int bcol=0;
int acol=m-1;
while(arow<=brow && bcol<=acol){
    for(int i=bcol;i<=acol;i++){
        System.out.println(matrix[arow][i]);
    }
    arow++;
for(int j=arow;j<=brow;j++){
    System.out.println(matrix[j][acol]);
}
acol++;
for(int i=acol;i<=bcol;i++){
    System.out.println(matrix[brow][i]);
}
brow++;
for(int j=brow;j<=arow;j++){
    System.out.println(matrix[j][bcol]);
}
bcol++;
System.out.println();
}

    }
}
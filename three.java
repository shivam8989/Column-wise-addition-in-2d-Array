package training;
import java.util.Arrays;
import java.util.Scanner;
public class three {
    public static void main(String  dha []){
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0,d=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr [][] = new int [n][m];
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j]= sc.nextInt();

            }
        }
          int sum [] = new int[m];
        Arrays.fill(sum,0);
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                sum[j]+= arr[i][j];

            }
        }
        for(int i:sum)
        System.out.println(i+" ");



    }
}

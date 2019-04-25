package Assignment3;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int a[][] = new int[m][m];
        Random rnd = new Random();
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                a[i][j] = rnd.nextInt(100);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int s=0;s<=(m-1)*2;s++){
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    //System.out.println(i+","+j+",s="+s);
                    if(i+j==s){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
        }
    }
}

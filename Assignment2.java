package Assignment2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int change=0;
        int cSetare=0;
        int setare = 0;
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Its not Odd");
        }else{
            int j=n/2;
            for(int i=0;i<n;i++){

                for(int z=0;z<j;z++){
                    System.out.print(" ");
                }
                for(int c=0;c<2*setare+1;c++){
                    System.out.print("*");
                }
                System.out.println("\n");
                if(change==1){
                    j++;
                }else {
                    j--;
                }
                if(j==-1){
                    j=1;
                    change=1;
                }
                if(setare == n/2){
                    cSetare = 1;
                }
                if(cSetare == 1){
                    setare--;
                }else{
                    setare++;
                }
            }

        }
    }

}







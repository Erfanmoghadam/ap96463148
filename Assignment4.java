package assignment4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void print(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]++);
            }
            System.out.println();
        }
    }
    public static void sortRow(int a[][],int r) {
        if (r > a.length - 1) {
            System.out.println("Out of index");
        } else {
            for (int n = 0; n < a.length; n++) {
                for (int i = 0; i < a.length; i++) {
                    for (int j = i+1; j < a.length; j++) {
                        if (a[r][i] > a[r][j]) {
                            int swap = a[r][i];
                            a[r][i] = a[r][j];
                            a[r][j] = swap;
                        }
                    }
                }
            }
        }
    }
    public static void sortColumn(int a[][],int c) {
        if (c > a.length - 1) {
            System.out.println("Out of index");
        } else {
            for (int n = 0; n < a.length; n++) {
                for (int i = 0; i < a.length; i++) {
                    for (int j = i+1; j < a.length; j++) {
                        if (a[i][c] > a[j][c]) {
                            int swap = a[i][c];
                            a[i][c] = a[j][c];
                            a[j][c] = swap;
                        }
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int a[][] =new int[m][m];
        Random rnd = new Random();
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                a[i][j] = rnd.nextInt(100);
            }
        }
        print(a);
        char cmd[] = input.next().toCharArray();
        if(cmd[0]=='c'){
            sortColumn(a,Character.getNumericValue(cmd[1]));
            print(a);
        }else if(cmd[0]=='r'){
            sortRow(a,Character.getNumericValue(cmd[1]));
            print(a);
        }else{
            System.out.println("Unkown command");
        }
    }
}

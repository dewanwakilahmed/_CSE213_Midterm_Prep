package mainpkg;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    /*
    public static void main(String[] args) {
        int x=12;
        float f=3.5f;
        System.out.println(x);
        System.out.println(f);
        System.out.println("x="+x+", f="+f);
        //                  "x=12, f=3.5"
    } 
    */
    /*
    public static void main(String[] args) {
        //Demo of 1-D array
        int arr1[]={11,22,33,44,55};
        //int  arr2[10];
        int[] arr3;
        arr3 = new int[10];
        int i;
        Random r = new Random();
        System.out.print("Elements of arr1: ");
        //for(i=0;i<5;i++){
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("Elements of arr3: ");
        for(i=0;i<arr3.length;i++){
           arr3[i] = r.nextInt(500);
            System.out.print(arr3[i]+" ");
            //System.out.print(arr3[i]);
            //System.out.print(", ");
        }         
    } 
    */
    public static void main(String[] args) {
        //Demo of 2-D array
        int[][] table; int i,j;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("How many rows? ");
        table = new  int  [s.nextInt()]  [];
        System.out.println("Elements of table: ");
        for(i=0;i<table.length;i++){
            table[i] = new int [r.nextInt(10)+1];
            for(j=0;j<table[i].length;j++){
                table[i][j]=r.nextInt(100);
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }     
}

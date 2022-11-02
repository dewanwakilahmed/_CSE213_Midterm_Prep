package mypkg;

import java.util.Random;
import java.util.Scanner;
import user.Student;

public class MainClass {
    /*
    public static void main(String[] args) {
        //TO Print a random number
        Random r=new Random();
        int x=20;
        System.out.println(x);
        System.out.println("Random no generated is: " 
                + r.nextInt());
    }
    */
    /*
    public static void main(String[] args) {
        //TO take user input from keyboard
        int id; String name; float salary;
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        salary = sc.nextFloat();
        System.out.println("ID="+id+", Name="+name
            +", Salary="+salary);
    }  
    */
    /*
    public static void main(String[] args) {
        //Demonstration of 1-D array
        int[] arr;
        arr = new int[10];
        int i;        Random r = new Random();
        int arr2[]={11,22,33,44,55};
        for(i=0;i<arr.length;i++){
            arr[i]=r.nextInt(100);
        }
        System.out.print("Elements of arr: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    */
    /*
    public static void main(String[] args) {
        //Demonstration of 2-D array
        float[][] table; int i,j;
        int[][] twoD = {{1,2}, {10}, {5,6,7}};
        int[][] another2D = new int[3][4];
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("How many rows? ");
        table =  new float[s.nextInt()][];
        for(i=0;i<table.length;i++){
            table[i] = new float[r.nextInt(10)+1];
            for(j=0;j<table[i].length ; j++){
                table[i][j]=r.nextFloat();
            }
        }
        System.out.println("Elements of table: ");
        for(i=0;i<table.length;i++){
            for(j=0;j<table[i].length ; j++){
                System.out.print(table[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("Elements of twoD: ");
        for(i=0;i<twoD.length;i++){
            for(j=0;j<twoD[i].length ; j++){
                System.out.print(twoD[i][j]+"   ");
            }
            System.out.println();
        } 
        System.out.println("Elements of another2D: ");
        for(i=0;i<another2D.length;i++){
            for(j=0;j<another2D[i].length ; j++){
                another2D[i][j] = i+j;
                System.out.print(another2D[i][j]+"   ");
            }
            System.out.println();
        }        
    }  
    */
    public static void main(String[] args) {
        ComplexNo c1 = new ComplexNo();
        Student asif = new Student();
        
    }
    void doSome(){
        //...
    }
    void doSome(int val){
        //...
    }    
}

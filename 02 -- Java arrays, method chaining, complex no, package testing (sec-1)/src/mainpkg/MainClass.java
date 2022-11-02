package mainpkg;

import java.util.Random;
import java.util.Scanner;
import users.Student;

public class MainClass {
    /*
    public static void main(String[] args) {
        int arr1[] = {11,22,33,44,55};
        //int[] arr2;
        //arr2 = new int[5];
        int[] arr2 = new int[5];
        int i;
        //for(i=0;i<5;i++)
        System.out.print("Elements of arr1: ");
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
        System.out.print("Elements of arr2: ");
        Random r = new Random();
        for(i=0;i<arr2.length;i++){
            arr2[i] = r.nextInt();
            System.out.print(arr2[i]+" ");
        }        
    }
    */
    /*
    public static void main(String[] args) {
        int x=12; float f=3.5f;
        System.out.println("Hello World");
        System.out.println(x);
        System.out.println(f);
    } 
    */
    /*
    public static void main(String[] args) {
        //demo of using random number
        Random r;
        r=new Random();
        System.out.println("Random no generated is: "
            + r.nextInt(100));
    } 
    */
    /*
    public static void main(String[] args) {
        //Demo of 1-D array
        Random r = new Random();
        int arr1[] = {11,22,33,44,55};
        //int arr2[10];
        int[] arr2 = new int[10], arr3;
        arr3 = new int[5] ;
        int i;
        System.out.print("Elements of arr2: ");
        //for(i=0;i<10;i++){
        for(i=0;i<arr2.length;i++){
            arr2[i]=r.nextInt(500);
            System.out.print(arr2[i]+" ");
        }    
    }
    */
    /*
    public static void main(String[] args) {
        //Demo of 2-D array
        Random r = new Random();
        int[][] table, table2; int i,j;
        Scanner s = new Scanner(System.in);
        System.out.print("How many rows? ");
        table = new int [s.nextInt()] [];
        System.out.println("Elements of table: ");
        for(i=0;i<table.length;i++){
            table[i] = new int [r.nextInt(10)+1];
            for(j=0;j<table[i].length;j++){
                table[i][j]=r.nextInt(100);
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        table2 = new int [3] [4];
        //table2 = new int [3] [];
        //for(i=0;i<table2.length;i++) table[i] = new int[4];
        System.out.println("Elements of table2: ");
        for(i=0;i<table2.length;i++){
            //table2[i] = new int [r.nextInt(10)+1];
            for(j=0;j<table2[i].length;j++){
                table2[i][j]=r.nextInt(100);
                System.out.print(table2[i][j]+" ");
            }
            System.out.println();
        }     
    }    
    */
    /*
    public static void main(String[] args) {
        int x; String str; float f;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");x=s.nextInt();
        s.nextLine();
        System.out.print("Enter str: ");str=s.nextLine();
        System.out.print("Enter f: ");f=s.nextFloat();
        System.out.println("x="+x+", str="+str+", f="+f);
        
        
        
        Student asif = new Student();
        asif.setStudentInfo();
        asif.showGradePoints();
        //asif.setStudentInfo().showGradePoints();
    }
    */
    
    public static void main(String[] args) {
        //testing method chaining using ComplexNo
        ComplexNo c1=new ComplexNo(), c2, c3, c4;
        System.out.print("c1 before setting CN = ");
        c1.showComplexNo();
        System.out.print("c2 before setting CN = ");
        c2 = new ComplexNo(13);
        c2.showComplexNo();
        System.out.print("c3 before setting CN = ");
        c3 = new ComplexNo(3,4);
        c3.showComplexNo();
        
        System.out.println("Enter ComplexNo c1: ");
        c1.setComplexNo();
        System.out.print("c1 = "); c1.showComplexNo();
        System.out.println("Enter ComplexNo c2: ");
        c2.setComplexNo();
        System.out.print("c2 = "); c2.showComplexNo();
        c3 = c1.add(c2);
        System.out.print("c3 = "); c3.showComplexNo();
        c4 = c3.add(c2).showComplexNo();
    }
    
}

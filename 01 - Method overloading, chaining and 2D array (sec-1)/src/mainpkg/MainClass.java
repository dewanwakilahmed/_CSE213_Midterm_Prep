package mainpkg;

import java.util.Random;
import java.util.Scanner;



public class MainClass {

    public static void main(String[] args) {
        ComplexNo c1 = new ComplexNo(),c2, c3;
        c1.setComplexNo();
        System.out.print("C1 = ");c1.showComplexNo();
        c2 = new ComplexNo();
        c2.setComplexNo();
        System.out.print("C2 = ");c2.showComplexNo();
        //Do we need to instantiate c3? NO
        c3 = c1.add(c2);
        //int x = c1.real;
        System.out.print("C3 = ");c3.showComplexNo();
    }
    void doSome(){
        //
    }
    void doSome(int x){
        //
    } 
}

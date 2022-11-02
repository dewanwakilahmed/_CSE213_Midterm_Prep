package mypkg;

import java.util.Random;
import java.util.Scanner;
import mymath.ComplexNo;
import user.Student;

public class MainClass {
    /*
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        obj.someMethod();
    }
    */
    
    public static void main(String[] args) {
        ComplexNo c1 = new ComplexNo(), c3=null;
        ComplexNo c2= new ComplexNo(5);
        ComplexNo c4= new ComplexNo(6,7);
        c3 = new ComplexNo();
        System.out.print("Initialized C1 = "); c1.showComplexNo();
        System.out.print("Initialized C2 = "); c2.showComplexNo();
     
        if(c3==null)
            System.out.println("c3 is not yet initialized");
        else{
            System.out.print("Initialized C3 = "); 
            c3.showComplexNo();
        }
        
        System.out.print("Initialized C4 = "); c4.showComplexNo();
        c1.setComplexNo();
        c1.showComplexNo();
	//c1.setComplexNo().showComplexNo();	//same client	say 1+2i
	c2.setComplexNo().showComplexNo();	//same client	say 3+4i
	//c3 = c1.add(c2);
        //c3.showComplexNo();
        c3 = c1.add(c2).showComplexNo();	//different clients
        
        ComplexNo cn1, cn2, cn3;
        cn1 = new ComplexNo();
        cn2 = new ComplexNo(10);
        cn3 = new ComplexNo(4,5);
        
        //cn1.setComplexNo();
        System.out.print("cn1 = "); cn1.showComplexNo();
        System.out.print("cn2 = "); cn2.showComplexNo();
        System.out.print("cn3 = "); cn3.showComplexNo();
    

        
    }
    */
}

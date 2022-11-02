package mypkg;

import java.util.Random;
import java.util.Scanner;
import mymath.ComplexNo;
import user.Student;

public class MainClass {

    public static void main(String[] args) {
        ComplexNo cn1, cn2, cn3;
        cn1 = new ComplexNo();
        cn2 = new ComplexNo(10);
        cn3 = new ComplexNo(4,5);
        cn1.showComplexNo();
        cn1.setComplexNo();
        cn1.showComplexNo();
        System.out.print("cn1 = "); cn1.showComplexNo();
        System.out.print("cn2 = "); cn2.showComplexNo();
        System.out.print("cn3 = "); cn3.showComplexNo();
	ComplexNo c1 = new ComplexNo(), c2 = new ComplexNo(),c3;
	c1.setComplexNo().showComplexNo();	//same client	say 1+2i
	c2.setComplexNo().showComplexNo();	//same client	say 3+4i
	c3 = c1.add(c2).showComplexNo();	//different clients
        
    }   
}

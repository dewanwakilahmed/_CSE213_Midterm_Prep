
package mymath;

import java.util.Scanner;

public class ComplexNo {
	private int real, img;      
        
        public ComplexNo(){
            real = img = 1;
        }
        
        public ComplexNo(int val){
            real = img = val;
        }  
        public ComplexNo(int val1, int val2){
            real = val1; img = val2;
        }        
        
	public ComplexNo setComplexNo(){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter real value: ");
            real = s.nextInt();
            System.out.print("Enter imaginary value: ");
            img = s.nextInt();            
            return this;
	}
	//public void showComplexNo(){
	public ComplexNo showComplexNo(){
            System.out.println(real + (img<0?"":"+") + img + "i");
            return this;
	}
	public ComplexNo add(ComplexNo c){
            ComplexNo temp = new ComplexNo();
            temp.real = real + c.real;
            temp.img = img + c.img;
            return temp;
	}    
}

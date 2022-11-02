
package mymath;

import java.util.Scanner;

public class ComplexNo {
    private int real, img; 

    public ComplexNo(int real, int img) {
        this.real = real;
        this.img = img;
    }
    public ComplexNo() {
        //real = img = 1;
    }
    public ComplexNo(int val){
        real = img = val;
    }  

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
      
    public ComplexNo setComplexNo(){
    //public void setComplexNo(){
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

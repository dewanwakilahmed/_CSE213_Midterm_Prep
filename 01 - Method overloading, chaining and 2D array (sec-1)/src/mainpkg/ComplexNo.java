package mainpkg;

import java.util.Scanner;

public class ComplexNo {
    private int real,img;

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
    public void setComplexNo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter real value: ");
        real=s.nextInt();
        System.out.print("Enter imaginary value: ");
        img=s.nextInt();  
    }
    public void showComplexNo(){
        System.out.println(real+((img<0)?"":"+")+img+"i");
    }
    ComplexNo add(ComplexNo c){
        ComplexNo temp = new ComplexNo();
        temp.real = this.real + c.real;
        temp.img = img + c.img;      
        return temp;
    }
}

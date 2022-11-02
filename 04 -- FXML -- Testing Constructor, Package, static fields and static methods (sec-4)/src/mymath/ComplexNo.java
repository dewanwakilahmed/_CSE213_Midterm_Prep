
package mymath;

public class ComplexNo {
    private int real, img;
    public void ComplexNo(){
        real=img=0;
    }
    public void ComplexNo(int val){
        real=img=val;
    }
    public void ComplexNo(int val1, int val2){
        real=val1; img=val2;
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
    
}

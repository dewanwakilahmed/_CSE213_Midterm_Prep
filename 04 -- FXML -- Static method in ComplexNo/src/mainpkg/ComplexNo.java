package mainpkg;

import java.util.ArrayList;

public class ComplexNo {
    private int real,img;

    public ComplexNo() {
        real=img=0;
    }

    public ComplexNo(int real, int img) {
        this.real = real;
        this.img = img;
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
    /*
    public static ComplexNo add(ComplexNo c1, ComplexNo c2, 
            ComplexNo[] cArr){
        ComplexNo temp =  new ComplexNo();
        temp.real += c1.real+c2.real;
        temp.img += c1.img+c2.img;
        int i;
        for(i=0;i<cArr.length;i++){
            temp.real += cArr[i].real;
            temp.img += cArr[i].img;
        }
        return temp;   
    }
    */

    @Override
    public String toString() {
        return "ComplexNo{" + "real=" + real + ", img=" + img + '}';
    }
    

    
    
    
    public String getStringValue(){
        return real+(img<0?"":"+")+img+"i";
    }
    
    //array version
    public static ComplexNo add(ComplexNo[] cArr){
        ComplexNo temp = new ComplexNo();
        int i;
        for(i=0;i<cArr.length;i++){
            temp.real += cArr[i].real;
            temp.img += cArr[i].img;
        }
        return temp;
    }
    
    
    //ArrayList version
    public static ComplexNo add(ArrayList<ComplexNo> cList){
        ComplexNo temp = new ComplexNo();
        int i;
        for(ComplexNo c: cList){
            temp.real += c.real;
            temp.img += c.img;
        }
        return temp;
    }
}

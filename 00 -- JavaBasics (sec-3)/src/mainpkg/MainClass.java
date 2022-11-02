package mainpkg;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    /*
    public static void main(String[] args) {
        //TO Print Hello World
        //PrintStream myOut;
        //myOut.println("Hello World");
        // TODO code application logic here
        System.out.println("Hello World");
        //sout tab : System.out.println("");  
    }
    */
    /*
    public static void main(String[] args) {
        //TO Print a random number
        Random r = new Random();
        System.out.println("The random no is: " + r.nextInt(500));
    }
    */
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
    void doSome(){
        //
    }
    void doSome(int x){
        //
    }    
    void doAnother(){
        //
    }
}

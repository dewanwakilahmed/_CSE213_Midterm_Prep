package mainpkg;

import java.util.Random;
import java.util.Scanner;



public class MainClass {
    /*
    public static void main(String[] args) {
        System.out.println("Hello World");
        // TODO code application logic here
        Random r1, r2 = new Random(); //not yet instancet
        //...
        r1 = new Random();
        System.out.println("Random no generated is: " +r1.nextInt());
    }
    */
    
    public static void main(String[] args) {
        //arr = [1,2,3,4,5,5]
        int arr[]={11,22,33,44,55};
        int i;
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        val = sc.nextInt();
        System.out.println("Val="+val);
    }
    
    
    public static void main(String[] args) {
        
        int arr[];
        Random r = new Random();
        int arrSize = r.nextInt(20)+1;
        loop:{
            generate a random number, 
                if even assign a random value to arr[i]
                else get arr[i] from user
        }
        loop:
            show array elements with space
     } 
*/
    
}

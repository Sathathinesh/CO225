/**
 * E/15/366
 * @author Thinesh
 */
import java.util.Scanner; // Use Scanner class for keyboard input 

public class E15366lab01q1 {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int num = in.nextInt(); // num variable used to define the keyboard input
        
        int special = num % 15; // find reminder for verify the special 
        
        int weird_1 = num % 6;  // reminder for verify the weird
        int weird_2 = num % 5;
        int weird_3 = num % 18;
        
        if (999<num){ // if the number > 999 ---> special
                       // check the conditions
           if (special==0 && (weird_1==0 && weird_2==0 && weird_3 !=0)) {
            System.out.println(num + " is special, big, weird, scary.");
           }
           if (special!=0 && (weird_1==0 && weird_2==0 && weird_3 !=0)) {
            System.out.println(num + " is not special but scary.");
           }
           if (special==0 && (weird_1!=0 || weird_2!=0 || weird_3 ==0)) {
            System.out.println(num + " is special, big, scary, but not weird.");
           }
           if (special!=0 && ( weird_1==0 || weird_2!=0 || weird_3 ==0)) {
            System.out.println(num + " is big, scary, but not weird.");
           }
        }
        if (999>num){ // if the number < 999 ---> then find whether the number special 
                       // check the conditions but not big 
            if (special ==0 && weird_3==0 ){
                System.out.println(num + " is special, but not scaery.");    
            }
            if (special !=0 && weird_3==0 ){
                System.out.println(num + " is not special and not scaery.");    
            }
            if (special==0 &&(weird_1==0 && weird_2==0 && weird_3 !=0) ) {
            System.out.println(num + " is special, weird, scary, but not big.");
           }
            if (special!=0 &&(weird_1==0 && weird_2==0 && weird_3 !=0) ) {
            System.out.println(num + " is not special and not big but weird and scary.");
           }
          
        }
    }
    
}

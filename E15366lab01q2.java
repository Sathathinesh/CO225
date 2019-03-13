/**
 * E/15/366
 * @author Thinesh
 */

import java.util.Scanner;   // get key board input from user.
public class E15366lab01q2{        // the name of the class
    //int n=0;
    public static void main(String[] args) {
     Scanner on =new Scanner(System.in);
     
        System.out.print("Enter the color: ");  
        
        int red=on.nextInt();    // get the value of red
        int green=on.nextInt();  // get the value of green 
        int blue =on.nextInt();  // get the value of blue
        int r;
        int g;
        int b;       // initial value of red , green and blue are zero
        
        // check gray color conditions --> that is red green and blue should be in the range of 112 to 143
		// gray color is in the range of 112 to 143
        if ((112<=red && red<=143) && (112<=green && green<=143) && (112<=blue && blue<=143)){ 
         r=colornew(red);         // used the colornew method to find the complement values of red
         g=colornew(green);       // used the colornew method to find the complement values of green
         b=colornew(blue);        // used the colornew method to find the complement values of blue
        }
        else {                    // in other type colors normaly substract by 255
            r=255-red;
            g=255-green;
            b=255-blue;
        }   
        System.out.printf("The complement: %d %d %d \n",r,g,b);    // output the value
    }
    // use the colornew method to find the complement of red , green and blue
    public static int colornew(int x){
      /*  if ((0<=x && x<=96) || (x>= 160 && x<=255 )){
          return 255-x;      // return the value
        }*/
        if (112<=x && x<=128){
            return x+128;
        }
         if (128<x && x<=143){
            return x-128;
        }
        return 0;  
     }
}



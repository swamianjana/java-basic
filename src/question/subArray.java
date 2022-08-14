package question;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
 public static void main(String[] args) {
     // System.out.println("Hello, World!");
     
     int[] x = {1,2,13,17,25};
     int[] y = {12,14,24,27,30,35};
     
     
     for(int i=0; i<x.length; i++){
         if(x[i] > y[0]){
             // insertion sort in 1st
             int temp = x[x.length -1];
             int tc = x.length-1;
             while(tc > i){
                 x[tc] = x[tc-1];
                 tc--;
             }
             x[i] = y[0];
             y[0] = temp;
             
             int holder = y[0];
             
             int k;
             for(k=1; k < y.length && y[k] < holder; k++){
                 y[k-1] = y[k];
             }
             y[k-1] = holder;
         }
     }
     
     
     System.out.println(Arrays.toString(x));
     System.out.println();
     System.out.println(Arrays.toString(y));
     
     // // Loop on x
     // for(int i=0; i<x.length; i++){
     //     if(x[i] > y[0]){
     //         int temp = x[i];
     //         x[i] = y[0];
     //         y[0] = temp;
             
     //         int holder = y[0];
             
     //         int k;
     //         for(k=1; k < y.length && y[k] < holder; k++){
     //             y[k-1] = y[k];
     //         }
     //         y[k-1] = holder;
     //     }
     // }
     
     
    
     
 }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

import java.util.ArrayList;

/**
 *
 * @author Federico Doria
 * @version 1.00
 */
public class SmallUtility {

    public static ArrayList<Integer> FibonacciSeries(int n) {
        ArrayList<Integer> ris = new ArrayList<>();
        int a = 1, b = 1, fib = 1;
        if (n == 1) {
            ris.add(a);
        } else if (n == 2) {
            ris.add(a);
            ris.add(b);
        } else if (n >= 3) {
            ris.add(a);
            ris.add(b);
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
                ris.add(fib);
            }
        }
        return ris;
    }
    
    public static boolean IsPrime (int n){
        boolean ris = true;
        int div = 2;
        while (div < n && (ris == true)){
            if ((n % div) == 0){
                ris=false;
            }else{
                div++;
            }
        
        }
        return ris;
    }
    
    public static int Factorial (int n){
        return (n > 0) ?(n * Factorial (n - 1)):1;
    }
    

}

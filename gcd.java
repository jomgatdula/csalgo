/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author aalucila
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input num1 ");
        num1 = sc.nextInt();
        System.out.print("Input num2 ");
        num2 = sc.nextInt();
 
        System.out.println(gcd(num1,num2));
    }
    
    static int gcd(int m, int n){
     if(n==0){
         return m;
    }
    else return gcd(n,m%n);

    }
}
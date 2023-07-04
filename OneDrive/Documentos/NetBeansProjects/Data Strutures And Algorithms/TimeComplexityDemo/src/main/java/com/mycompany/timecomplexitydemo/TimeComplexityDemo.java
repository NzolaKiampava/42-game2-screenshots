/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timecomplexitydemo;

/**
 *
 * @author TECH BY TECH
 */
public class TimeComplexityDemo {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        
        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSum(99999));
        
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " millisecs.");
    }
    
    /*public int findSum(int n) {
        return n * (n + 1) / 2;
    }*/
    
    
    public int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + 1;
        }
        
        return sum;
    }
    
}

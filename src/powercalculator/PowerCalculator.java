/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package powercalculator;

public class PowerCalculator {

    public static void main(String[] args) {
        // Test cases
        System.out.println(recursivePower(2, 3));  
        System.out.println(recursivePower(2, -3)); 
        System.out.println(recursivePower(5, 0));  
        System.out.println(recursivePower(3, 2));  
        System.out.println(recursivePower(2, 10)); 
    }

    public static double recursivePower(int base, int exponent) {
        
        if (exponent == 0) {
            return 1; 
        }
        
        if (exponent < 0) {
            return 1.0 / recursivePower(base, -exponent); 
        }
        
        return base * recursivePower(base, exponent - 1);
    }
}

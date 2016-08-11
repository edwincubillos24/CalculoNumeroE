/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculonumeroe;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class CalculoNumeroE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double number, i,j,fact=1;
        double exp=1;
        
        number = lector.nextInt();
        
        for (i=1;i<=number;i++){
            for (j=1;j<=i;j++){
                fact = fact * j;                
            }         
            exp = exp + 1/fact;          
            fact=1;
        }
        System.out.print(exp);
    }
}
    


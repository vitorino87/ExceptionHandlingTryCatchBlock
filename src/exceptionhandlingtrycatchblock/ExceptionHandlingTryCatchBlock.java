/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingtrycatchblock;

/**
 *
 * @author tiago.lucas
 */
public class ExceptionHandlingTryCatchBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 10 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement");
    }

}

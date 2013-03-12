/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author i060752
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Olá Rui,");
        System.out.println("Boa tarde!");
        System.out.println("Adeus!");
        
        double a=2, b=3, c=0;
        
        if(a==0)
        {
            System.out.println("Nao faz nada");
        }
        else
        {
            c=a+b;
            System.out.print(c);
            System.out.println("\n");
            c=a-b;
            System.out.print(c);
            System.out.println("\n");
            c=a*b;
            System.out.print(c);
            System.out.println("\n");
            c=a/b;
            System.out.print(c);
            System.out.println("\n");
        }
    }
}

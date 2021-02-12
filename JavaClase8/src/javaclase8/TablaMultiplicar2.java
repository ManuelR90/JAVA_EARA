
package javaclase8;

import java.util.Scanner;

/**
 *
 * @author ManuelR90>
 */
public class TablaMultiplicar2 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int in;
        int out;
        int res;
        
            System.out.println("Que tabla de multiplcar quieres: ");
            in = entrada.nextInt();
        
            System.out.println("Hasta que numero quieres: ");
            out = entrada.nextInt();
            
                for(int i = 1; i <= out; i++){
                    res = in * i;
                    
                        System.out.println(in + " X " + i + " = " + res);
                    
                }
        
    }
}

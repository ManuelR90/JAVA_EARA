
package javaclase8;

import java.util.Scanner;

/**
 *
 * @author ManuelR90>
 */
public class Repeticion {
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        
            System.out.println("Cuantas hojas quiere imprimir: ");
            numero = entrada.nextInt();
        
                for(int i = 0; i <= numero; i++){
                    System.out.println("Pagina: " + i);
                }
    }
    
}

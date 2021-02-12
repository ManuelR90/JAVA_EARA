package javaclase8;

import java.util.Scanner;

/**
 *
 * @author ManuelR90>
 */

public class SWITCH1 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int a;
        
            System.out.println("Escribe cualquiera de estos numeros: 1, 2, 5");
            a = entrada.nextInt();
        
                switch(a){
                    case 1:
                        System.out.println("Estas en case 1");
                        System.out.println("Buenos dias");
                    break;
                    
                    case 2:
                        System.out.println("Estas en case 2");
                        System.out.println("Buena tarde");
                    break;
                        
                    case 5:    
                        System.out.println("Estas en case 5");
                        System.out.println("Buena noche");
                    break;
                    
                    default:
                        System.out.println("Sin coincidencias");
                }
    }
    
}

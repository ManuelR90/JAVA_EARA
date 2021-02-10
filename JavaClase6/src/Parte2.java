/*
Programa para 
 */

/**
 *
 * @author ManuelR90>
 */
package defaultpackage;

public class Parte2{

    public static void main(String[] args) {
        int numero = 10; 
        System.out.println("Tu numero es: " + 10 + " decimal");
                
        //-----Suma de dos variables-----
        //declara 2 variables y una para la operacion 
        int numero1;
        int numero2;
        int Operacion;
        
        //Asigna valores a las variables
            numero1 = 5;
            numero2 = 10;
            
        //Genera la operacion
            Operacion = numero1 + numero2;
           System.out.println("El resultado de la operacion de suma: ");
           System.out.println("Numero 1: " + numero1);
           System.out.println("Numero 2: " + numero2);
           System.out.println("Es: " + numero1 + " + " + numero2 + " = " + Operacion);
           
        //-----Operadores aritmeticos-----
        //incremento
        int a, b, c;
        System.out.println("\nIncrementos");
        
            a = 1;
        System.out.println("Valor de a: " + a);
        
            b = a++; //Asignaremos el valor de A a B, y despues incrementamos A
        System.out.println("Valor de b: " + b);
        
            c= ++a; //Primero incrementamos A, y despues asignamos el valor de A a C
        System.out.println("Valo de c: " + c);
    }
    
}

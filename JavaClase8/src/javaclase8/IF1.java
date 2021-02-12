package javaclase8;
import java.util.Scanner;
/**
 *
 * @author ManuelR90>
 */
public class IF1 {
    public static void main(String [] args){
        int numero1;
        int numero2;
            numero1 = 10;
            numero2 = 15;
        
                if(numero1<numero2){
                    System.out.println("El numero dos es mayor");
                    System.out.println("\nNumero 1: " + numero1 + "\nNumero 2: " + numero2);
                }
                else{
                    System.out.println("El numero uno es mayor");
                    System.out.println("\nNumero 1: " + numero1 + "\nNumero 2: " + numero2);
                }
        
         //-----Programa que te diga si puedes entrar a un bar-----
         
         Scanner entrada = new Scanner(System.in);
         //Scanner entrada2 = new Scanner(System.in);
         
         int edad;
         final int edadEstablecida = 18;
         String conocer;
         
            System.out.println("\n\nCadenero: ¿Cual es tu edad?");
            System.out.println("Persona: Mi edad es: ");
            edad = entrada.nextInt();
            
            System.out.println("Cadenero: ¿Conoces a alguien adentro?");
            conocer = entrada.next();
            
                if(edad >= 18){
                    System.out.println("Cadenero: Puedes pasar.");
                }
                else if(conocer.equalsIgnoreCase("si")){
                    System.out.println("Cadenero: Puedes pasar.");
                }
                                
                else{
                    System.out.println("Cadenero: No puedes pasar.");
                }
            
            System.out.println("Persona: Gracias.");
    }
    
}

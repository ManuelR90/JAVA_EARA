import java.util.Scanner;

public class Clase6F{
    public static void main(String [] args){
        // Para leer desde el teclado
        // Clase de tipo escaner y es estatica
        
        Scanner EntradaDeTeclado = new Scanner(System.in);
        
        // Metodos
        /*
        EntradaDeTeclados.nextInt() Lee un numero entero (int por teclado)
        EntradaDeTeclados.nextDouble() Lee un numero real (double por teclado)
        EntradaDeTeclados.nextLine() Lee una cadena de caracteres hasta )
        */
        
        //-----Entrada de Datos1-----
        int numero;
        System.out.println("-----Ingresando Datos-----");
        
        System.out.print("Ingresa un dato numerico entero: ");
            numero = EntradaDeTeclado.nextInt();
        System.out.print("El numero que tecleaste es: " + numero);
        
        
        //-----Entrada de dato2-----
        int edad;
        System.out.print("\n\nIngresa tu edad: ");
            edad = EntradaDeTeclado.nextInt();
            
            edad = edad+1;
        System.out.print("El proximo año tu edad sera de: " + edad + " años");
        
        
        //-----Entrada de dato3-----
        // Diseñar un programa que calcule la longitud y el area de una circunferencia
        // Longitud = 2PI * radio
        // Area = PI * radio2
        
        System.out.println("\n\nLongitud y area de una circunferencia");
        final double PI = 3.1416; // Constante 
        double radio; // Puede tener decimales
        double area, longitud; // Declaracion en double por decimales
        
        //Pedir el radio al usuario
        System.out.print("Escriba el radio: ");
            radio = EntradaDeTeclado.nextInt();
            
            longitud = (2 * PI) * radio;
            area = PI * (radio * radio);
            
        System.out.print("La longitud del circulo es: " + longitud);
        System.out.print("\nEl area es: " + area);
            
        
    }
    
}

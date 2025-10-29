/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_y_excepciones;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.util.stream.Gatherers.scan;

/**
 *
 * @author Win
 */
public class EjerciciosExcepciones {
    public static void main(String[] args) {
        System.out.println("1.División segura\n\n" +"Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();  
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();    

        try {
            int resultado = num1 / num2;  
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        
        }
        
    
        //2.Conversión de cadena a número
        //  Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.
        System.out.println("\n\n2.Conversión de cadena a número\n\n" +"Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.");
        System.out.println("Ingrese un texto para convertir en INT");
            String texto_a_numero = sc.next();
        try{
            int convertido = Integer.parseInt(texto_a_numero);
            System.out.println(convertido);
        }
        catch (NumberFormatException e){
            System.out.println("El tipo de dato ingresado no se puede convertir a número ");

        }
        
        //3.Lectura de archivo 
        //  Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
                
        System.out.println("\n\n3.Lectura de archivo \n" +"  Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.");
        System.out.println("Ingrese el nombre del archivo");
      
        System.out.println("Ingrese el nombre del archivo (ej: archivo.txt):");
        String nombre = sc.next(); // sc ya lo declaraste al principio
        File archivo = new File(nombre);

        try {
            Scanner scArchivo = new Scanner(archivo);
            while (scArchivo.hasNextLine()) {
                System.out.println(scArchivo.nextLine());
            }
            scArchivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        }
        
        //4.Excepción personalizada
        //  Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n4.Excepción personalizada \n" +"  ○	Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.");
        System.out.println("Ingrese una edad");
        int edad = Integer.parseInt(scan.nextLine());
        try{
        if(edad < 0 || edad > 120)
            throw new EdadInvalidaException("Edad inválida");
            System.out.println("Edad ingresada: " + edad);
        } catch (EdadInvalidaException e) {
             System.out.println("Error: " + e.getMessage());
        }
          
        
    }
    
     public static class EdadInvalidaException extends RuntimeException{

        public EdadInvalidaException() {
        }

        public EdadInvalidaException(String message) {
            super(message);
        }

        public EdadInvalidaException(String message, Throwable cause) {
            super(message, cause);
        }

        public EdadInvalidaException(Throwable cause) {
            super(cause);
        }

        public EdadInvalidaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
                
        } 
}
    
        


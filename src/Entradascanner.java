import java.util.Scanner;

public class Entradascanner {

    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
        System.out.println("cómo te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Qué edad tienes?");
        int edad = scanner.nextInt();
        System.out.println("tu nombre es: " + nombre + " \ntu edad es: " + edad);

        if(edad > 18 ){
            System.out.println("Eres mayor de edad " + nombre);
        }else {
            System.out.println("eres menor de edad" + nombre );
        }
        }



    }


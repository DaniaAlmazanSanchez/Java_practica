import java.util.Scanner;
public class Operadoresaritmeticos {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("selecciona una opccion: \n 1- suma \n 2- resta \n 3- multiplicación \n 4- divición");
        int opccion = scanner.nextInt();
        System.out.println("ingresa primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("ingresa segundo numero: ");
        int numero2 = scanner.nextInt();
       if(opccion==1){
           //casteo (double)
           double suma = (double)numero1 * numero2;
           System.out.println("la suma es:" + suma);
       }else if(opccion == 2){
           int resta = numero1 - numero2;
           System.out.println("la resta es: " + resta);
       }else if(opccion == 3){
           int multiplicacion = numero1 * numero2;
           System.out.println("La multiplicacion es:" + multiplicacion);
       }else if(opccion == 4){
           int divisio = numero1/numero2;
           int residuo = numero1%numero2;
           System.out.println("la division es:" + divisio + "el residuo es : " + residuo);
       }else{
           System.out.println("opccion no valida intentalo de nuevo");
       }




    }
}

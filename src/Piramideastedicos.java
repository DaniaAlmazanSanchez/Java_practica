import java.util.*;
public class Piramideastedicos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un numero del 0 al 20");
        int numeroingresado = scanner.nextInt();



        if(numeroingresado>=0 && numeroingresado<=20){

            for (int i=0; i<numeroingresado-1;i++) {
                System.out.print("*");
            }
            }
            System.out.println();
            for (int i=0; i< numeroingresado; i++){
                System.out.print("+");
            }
        }
    }



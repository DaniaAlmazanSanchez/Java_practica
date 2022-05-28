import java.util.Scanner;
public class tablas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la tabla de multiplicacar deseada:");
        int tablas = scanner.nextInt();
        for (int numero = 0; numero <= 10; numero ++){
           int operacion = tablas*numero;
            System.out.println( tablas + "*" + numero + "=" + operacion );
        }

    }
}

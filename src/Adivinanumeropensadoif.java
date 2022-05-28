import java.util.*;
public class Adivinanumeropensadoif {
    public static void main(String[] args){
        /*0 Reset
       30 Texto en Negro (Black)
       31 Texto en Rojo (Red)
       32 Texto en Verde (Green)
       33 Texto en Amarillo (Yellow)
       34 Texto en Azul (Blue)
       35 Texto en Morado (Magenta)
       36 Texto en Azul (Cyan)
       37 Texto en Blanco (White) .*/
        Scanner scanner =  new Scanner(System.in);
        int numeropensado = 7;
        String color;
        System.out.println("Ingresa numero que estoy pensando");
        int numeroingresado = scanner.nextInt();

        if(numeropensado == numeroingresado){
            color = "\033[0;32m";// 32m color verde
            System.out.println(color + "Genial adivinaste!!");
        }else{
            color = "\033[0;34m";//color azul
            System.out.println(color + "lo siento, el numero pensado era: " + numeropensado);
        }

    }
}

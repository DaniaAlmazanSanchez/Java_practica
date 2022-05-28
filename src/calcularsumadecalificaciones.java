
/*
Ejercicio:
calcula la suma y promedio de tres calificaciones por teclado
 */
import java.util.*;
public class calcularsumadecalificaciones {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        double calificacion1, calificacion2,calificacion3,suma,promedio,redondeado;
        String name;
        System.out.println("Ingresa tu nombre: ");
        name = entrada.nextLine();
        System.out.println("ingresa calificacion 1 ");
        calificacion1 = entrada.nextDouble();
        System.out.println("ingresa calificacion 2 ");
        calificacion2 = entrada.nextDouble();
        System.out.println("ingresa calificacion 3 ");
        calificacion3 = entrada.nextDouble();

        //operaciones
        suma = calificacion1 + calificacion2 + calificacion3;
        promedio = suma/ 3;
        redondeado = Math.round(promedio);


        System.out.println(name + " la suma de tus calificciones son : " + suma + "redondeo :"+redondeado +
                "\n tu califocacion final es : " + promedio);

    }
}

/*
Programa dnde se calcula la calificacion final de un estudiante donde se califica en base a cuatro categorias:participación 10%, primer examen parcial 25%
segundo examen parcial 25% y calificacion de examen final 40%.
 */


import java.util.*;
public class Calificacionfinal {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        //aspectos de su rendimiento academico
        float participacion,p_exam_parcial,s_exam_parcial,exam_final,calif_final,valor1 ;
        String name;
        System.out.println("Ingresa nombre: ");
        name = entrada.nextLine();
        System.out.println("Ingresa tu puntaje de participación: ");
        participacion = entrada.nextFloat();
        System.out.println("Ingresa tu puntaje del primer examen parcial: ");
        p_exam_parcial = entrada.nextFloat();
        System.out.println("Ingresa tu puntaje de segundo examen parcial: ");
        s_exam_parcial = entrada.nextFloat();
        System.out.println("Ingresa tu puntaje de examen final: ");
        exam_final = entrada.nextFloat();

        participacion *= 0.10f;
        p_exam_parcial *=  0.25f;
        s_exam_parcial *=  0.25f;
        exam_final *=  0.40f;

       System.out.println("tu calificacion es :"+ "particicpacion: " + participacion + "\nprimer examen parcial: "
               + p_exam_parcial + "\nsegundo examen parcial: "
               + s_exam_parcial +"\nexamen final:"+ exam_final+ "\ncalificacion:"
               + (participacion + p_exam_parcial + s_exam_parcial + exam_final));




    }
}

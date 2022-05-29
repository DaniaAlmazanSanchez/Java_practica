/*
Autor:Dania Almazan Sanchez
Programa que calcula el cuadrado de una suma
 */
import javax.swing.*;
public class Cuadradodesuma {
    public static void main (String args[]){
        //formula: (a+b)2=a2+b2+2ab

        int valor_a,valor_b, resultado;
        int exponente=2;

         valor_a =Integer.parseInt(JOptionPane.showInputDialog("Ingresa volor de  a"));
         valor_b =Integer.parseInt(JOptionPane.showInputDialog("Ingresa volor de  b"));

         resultado = (int) Math.pow(valor_a,exponente) + (int)Math.pow(valor_b,exponente)+ 2*valor_a*valor_b;


        JOptionPane.showMessageDialog(null, "(a + b)2:a2 + b2 +2ab :" + resultado );



    }

}

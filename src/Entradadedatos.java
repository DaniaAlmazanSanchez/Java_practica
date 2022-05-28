import javax.swing.*;

public class Entradadedatos {

    public static void main(String args[]){

        int edad;
        String nombre;
        double peso;
        float estatura;
        char  tipo_sangre;

        nombre = JOptionPane.showInputDialog("ingresa nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa edad"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("ingresa peso"));
        tipo_sangre = JOptionPane.showInputDialog("tipo de sangre").charAt(0);


        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + "Edad: " + edad +  " años \n"+"peso: " + peso + " kilos \n" + "tipo de sangre: " + tipo_sangre + "+");


    }
}

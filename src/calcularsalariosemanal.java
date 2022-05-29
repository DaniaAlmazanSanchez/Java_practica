import javax.swing.*;
public class calcularsalariosemanal {
    public static void main(String args[]){

        float salario_porhora, horas_trabajadas, dias_trabajados,salario_semanal;
        String name;

        name=JOptionPane.showInputDialog("Ingresa nombre: ");
        salario_porhora = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu salario por hora"));
        horas_trabajadas = Float.parseFloat(JOptionPane.showInputDialog("Cuantas horas trabajas al dia?"));
        dias_trabajados = Float.parseFloat(JOptionPane.showInputDialog("Ingresa dias trabajdos a la semana"));

        salario_semanal = dias_trabajados * (salario_porhora * horas_trabajadas);

        JOptionPane.showMessageDialog(null,"tu salario semanal es: " + salario_semanal);




    }
}

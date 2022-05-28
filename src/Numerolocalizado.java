import javax.swing.JOptionPane;
public class Numerolocalizado {
    public static void main(String[] args){

        int numeroingresado = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa numero para obtener información 0 al 10"));

        if(numeroingresado<3){
            JOptionPane.showMessageDialog(null,"el numero ingresado es menor que 3");
        }else if(numeroingresado<5){
            JOptionPane.showMessageDialog(null,"el numero ingresado esta entre 3 y 5");
        }else if(numeroingresado<10){
            JOptionPane.showMessageDialog(null,"el numero ingresad esta entre 5 y 10");
        }else{
            System.out.print("error el numero ingresado no se encuentra");

        }
    }
}

import javax.swing.JOptionPane;

public class CuadradoAstedicos {
    public static void main(String[] args) {

        int numeroingresado = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa un  un numero del 0 al 50"));
        if (numeroingresado >= 0 && numeroingresado <= 50) {
            //parte superior
            for (int i = 0; i < numeroingresado; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < numeroingresado-2; i++) {
                System.out.print("*");
                for (int j = 0; j < numeroingresado-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

                //parte inferior
                for (int i = 0; i < numeroingresado; i++) {
                    System.out.print("*");
                }

            }
        }
    }


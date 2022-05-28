public class Alcancedelasvariables {
    public static void main(String args[]) {
        int horas = 0;
        int segundosdeldia = 24 * 3600;

        while (horas < 24) {
            horas = horas + 1;
            int minutos = horas * 60;
            int segundos = minutos * 60;

            System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos ");
        }

            System.out.println("un dia tiene " + segundosdeldia + " segundos faltan " + segundosdeldia * 3 + " segundos " + "para ver el video de Enrique");
        for (int i = 3; i > 0; i--) {
            System.out.println( i + "(* . *)");
        }
            System.out.println( "Ya casi esta listo?");
    }
}

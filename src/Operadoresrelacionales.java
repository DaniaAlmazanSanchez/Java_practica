public class Operadoresrelacionales {
    public static void main(String args[]){
        boolean mayorque = 34>22;
        boolean menorque = 34<22;
        boolean mayorigual = 34>=22;
        boolean menorigual = 34!=22;
        String gato = "gato";
        String pato = "pato";

        System.out.println("es mayor 34 que 22: " + mayorque + "\nes menor 34 que 22: " + menorque + "\nes mayor 34 o igual que 22: " + mayorigual);
        System.out.println( "gato es igual apato: " + gato == pato);
    }
}

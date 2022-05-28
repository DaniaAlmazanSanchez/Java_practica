public class Tablasdeverdad {
    public static void main(String args[]){
   //tablas de verdad and(&),or(|) y not(!)

   //La tabla de verdad and dice que cuando dos valore sean verdaderos es verdadero

        System.out.println("-----------Tabla de verdad and-----------------------");
        System.out.println("False & False: " + (false & false));
        System.out.println("False & True: " +  (false & true));
        System.out.println("True  & False: " + (true & false));
        System.out.println("True  & True: " +  (true & true));

   //latable de verdad or dise que almenos uno de sus valores debe ser verdadero

        System.out.println("-----------Tabla de verdad or-----------------------");
        System.out.println("False & False: " + (false | false));
        System.out.println("False & True: "  + (false | true));
        System.out.println("True  & False: " + (true | false));
        System.out.println("True  & True: "  + (true | true));

   // el not niega el valor

        System.out.println("-----------Tabla de verdad not-----------------------");
        System.out.println("la negacion de False es: " + !false);
        System.out.println("la negacion de True es: " + !true);

   }
}

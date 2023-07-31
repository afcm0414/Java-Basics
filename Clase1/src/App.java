public class App {
    public static void main(String[] args) throws Exception {

        //Operadores Logicos

        boolean esMayor = false;
        boolean esEstudiante = true;

        //and
        boolean puedeVotar = esEstudiante && esMayor;
        System.out.println("and: "+puedeVotar);

        //Or
        puedeVotar = esEstudiante || esMayor;
        System.out.println("or: "+puedeVotar);

        //Not 
        puedeVotar = !puedeVotar;
        System.out.println("Not: "+puedeVotar);

        boolean expresion = (true && !false) || false;
        System.out.println ("ejercicio: "+expresion);

        //Operadores de incremento o decremento 
        int numero = 5;
        System.out.println("IncrementoPrefijo: "+(++numero));
            System.out.println("Impresion: "+(numero));

        System.out.println("IncrementoSufijo: "+(numero++));
            System.out.println("Impresion: "+(numero));

        System.out.println("Holaa, soy Andres!");
    }
}

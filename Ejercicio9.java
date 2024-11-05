import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Indica una cadena de caracteres: ");
        String cadena=entrada.nextLine();
        System.out.print("Indica una subcadena y te dira si esta dentro de la cadena: ");
        String subcad=entrada.nextLine();
        byte contador=0;
        for (int i = 0; i < cadena.length()-subcad.length(); i++) {
           if (cadena.substring(i, subcad.length()+i).equals(subcad)) {
            System.out.println("La subcadena "+subcad+" esta dentro de la cadena.");
            contador++;
           }
        }
        if (contador!=1) {
            System.out.println("La subcadena "+subcad+" no esta dentro de la cadena.");
        }
    }
}

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Indique una cadena de caracteres y convertire las minusculas en mayusculas y viceversa: ");
        String cadena=entrada.nextLine();
        String cadnueva="";
        String caracter="";
        int i=0;
        for (i = 0; i < cadena.length(); i++) {
            caracter=cadena.substring(i, i+1);
            if (caracter.equals(caracter.toLowerCase())) {
                cadnueva=cadnueva+caracter.toUpperCase();
            }
            if (caracter.equals(caracter.toUpperCase())) {
                cadnueva=cadnueva+caracter.toLowerCase();
            }
        }
        System.out.println("La cadena de caracteres convertida es: "+cadnueva);
    }
}

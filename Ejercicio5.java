import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Indique su nombre y apellidos y le dare sus iniciales: ");
        String cadena=entrada.nextLine();
        char caracter=cadena.charAt(0);
        String cadnueva="";
        cadnueva=cadnueva+caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter=cadena.charAt(i);
            if (caracter==' ') {
                caracter=cadena.charAt(i+1);
                cadnueva=cadnueva+caracter;
            }
        }
        cadnueva=cadnueva.toUpperCase();
        System.out.println("Tus inicales son: "+ cadnueva);
    }
}

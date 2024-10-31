import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Indique una cadena de caracteres y te dire las palabras introducidas: ");
        String cadena=entrada.nextLine();
        int contador=1;
        char carac=' ';
        for (int i = 0; i < cadena.length(); i++) {
            carac=cadena.charAt(i);

            if (carac == ' ') {
             if (cadena.charAt(i+1)!=' ') {
                contador++;
             }
            }
        }
        System.out.println("La cadena introducida tiene "+contador+" palabras");
    } 
}
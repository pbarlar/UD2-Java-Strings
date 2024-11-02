import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Indica una cadena de caracteres y la mostraré invertida: ");
        String cadena=entrada.nextLine();
        char caracter=' ';
        int longitud=cadena.length();
        String cadinvertida=" ";
        for (int i = 1; i < cadena.length()+1; i++) {
            caracter=cadena.charAt(longitud-i);
            cadinvertida=cadinvertida+caracter;
        }
        System.out.println("La cadena introducida invertida es: "+cadinvertida);
    }
}
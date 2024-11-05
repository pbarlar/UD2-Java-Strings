import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Indica una cadena de caracteres: ");
        String cadena=entrada.nextLine();
        System.out.print("Indica el caracter de la cadena que quieres sustituir: ");
        String caracter1=entrada.nextLine();
        System.out.print("Indica el caracter que quieres que entre a la cadena por el sustituido: ");
        String caracter2=entrada.nextLine();
        System.out.println("La cadena con el caracter sustituido es: "+cadena.replace(caracter1, caracter2));
    }
}

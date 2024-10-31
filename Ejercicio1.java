import java.util.Scanner;

class Ejercicio1{
    public static void main(String[] args) {
        String cadena;
        char caracter;
        System.out.print("Indique una cadena de caracteres: ");
        Scanner entrada=new Scanner(System.in);
        cadena=entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            caracter= cadena.charAt(i);
            System.out.println(caracter);
        }
    }
}
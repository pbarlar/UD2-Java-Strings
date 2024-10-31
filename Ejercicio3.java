import java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine();
        char caracter = ' ';
        boolean valido = false;
        while (!valido) {
            System.out.print("Introduce un carácter: ");
            String input = entrada.nextLine();
            if (input.length() == 1) {
                caracter = input.charAt(0);
                valido = true;
            } else {
                System.out.println("Error: Tienes que introducir solo un carácter.");
            }
        }
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces.");
    }
}

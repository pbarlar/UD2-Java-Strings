import java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
        String cadena;
        String caracter;
        int contador=0;
        System.out.print("Indica una cadena de caracteres: ");
        Scanner entrada=new Scanner(System.in);
        cadena=entrada.nextLine();
        System.out.print("Indica el caracter que quieres buscar: ");
        caracter=entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i)==caracter) {
                contador=contador+1;
            }
        }
        System.out.println("El caracter que has introducido esta "+contador+" en la cadena");
    }
}

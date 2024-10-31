import java.util.Scanner;

class Ejercicio2 {
    public static void main(String[] var0) {
        String cadena;
        String subcadena;
       System.out.print("Indique una cadena de caracteres: ");
        Scanner entrada=new Scanner(System.in);
        cadena=entrada.nextLine(); 
        System.out.print("Indique una subcadena de caracteres: ");
        subcadena=entrada.nextLine(); 
        
            
        if (cadena.startsWith(subcadena)) {
            System.out.println("La subcadena empieza igual que la subcadena");
        } else {
            System.out.println("La subcadena no empieza igual que la cadena");
        }
    }
}

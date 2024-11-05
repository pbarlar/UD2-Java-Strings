import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Indica una palabra y te dire si es palindroma: ");
        String cadena=entrada.nextLine();
        String cadinvertida="";
        char caracter=' ';
        for (int i = 1; i < cadena.length()+1; i++) {
            caracter=cadena.charAt(cadena.length()-i);
            cadinvertida=cadinvertida+caracter;
        }
        if (cadena.equals(cadinvertida)) {
            System.out.println("La palabra "+cadena+" que has introducido es palíndroma.");
        }else{
            System.out.println("La palabra "+cadena+" no es palíndroma.");
        }
    }
}

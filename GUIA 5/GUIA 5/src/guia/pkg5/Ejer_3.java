

package guia.pkg5;
import java.util.Random;
    import java.util.Scanner;
    /* Descripción:
     *
     * 
     */
    public class Ejer_3 {


      public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                Random rand = new Random();

        int num;
        System.out.println("Ingrese el tamaño del vector");
        num = leer.nextInt();

        int vector[] = new int[num];

        for (int i = 0; i < num; i++) {

            vector[i] = rand.
            // vector[i] = rand.nextInt(100);

            System.out.println("[" + vector[i] + "]");
        }

        System.out.println("Ingrese el numero a buscar");
        int num2 = leer.nextInt();
        int c = 0;

        for (int i = 0; i < num; i++) {

            if (vector[i] == num2) {
                c++;

            }

        }
        switch (c) {
            case 0:
                System.out.println("no de encontro el numero");
                break;
            case 1:
                System.out.println("el numero se encontro en el vector");
                break;
            default:
                System.out.println(" el numero se encuentra mas de una vez en el vector");
                break;
        }

    }
    }
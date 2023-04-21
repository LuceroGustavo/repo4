package guia.pkg5;

import static java.lang.Math.random;
import java.util.Scanner;

public class ejer_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;
        System.out.println("Ingrese el tamaño del vector");
        num = leer.nextInt();

        int vector[] = new int[num];

        for (int i = 0; i < num; i++) {

            vector[i] = (int) (random() * 10);
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

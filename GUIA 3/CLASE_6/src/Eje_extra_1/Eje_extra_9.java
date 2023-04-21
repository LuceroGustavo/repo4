
package Eje_extra_1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Eje_extra_9 {

    /* descripción:
     Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cociente = 0;

        System.out.println("Ingrese un numero a dividir ");
        int dividendo = leer.nextInt();
        System.out.println("Ahora Ingrese el Divisor");
        int divisor = leer.nextInt();

        while (dividendo >= divisor) {

            dividendo = dividendo - divisor;
            cociente++;
        }
        

        System.out.println("el resultado es " + cociente);
        System.out.println("Y el resto es " + dividendo);
        System.out.println(" toma eso!!! divisionnnn");
    }

}


package guia.pkg5;

/*Descripción:
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
    de equipo y define su tipo de dato de tal manera que te permita alojar sus

 */


import java.util.Scanner;

public class M_lectura_13 {

   

    public static void main(String[] args) {

        String aux;

        String[] equipo = new String[5];

        for (int i = 0; i < 5; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese en nopmbre");

            equipo[i] = leer.next();
            
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("["+equipo[i]+ "]");
        }

    }

}


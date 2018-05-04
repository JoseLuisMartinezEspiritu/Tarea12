package kata2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JoséLuis
 */
public class InicioKata2 {
    public static void main (String [] args){
        
        Kata2 k2 = new Kata2();
        System.out.println("Ingrese el numero a convertir:");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();
        System.out.println("SON"+k2.convertir(numero));
    }
}

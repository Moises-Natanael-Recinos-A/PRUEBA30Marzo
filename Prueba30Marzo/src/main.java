
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moises
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nom, Dire;
        int tel;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
            Nom = teclado.nextLine();
        System.out.println("Ingrese Direccion");
            Dire = teclado.nextLine();    
        System.out.println("Ingrese Número de Telefono");
            tel = teclado.nextInt();    
        System.out.println("Nombre"+Nom);
        System.out.println("Dirección"+Dire);
        System.out.println("Numero de Telefono"+tel);
    }
    
}

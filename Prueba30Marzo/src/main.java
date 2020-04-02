
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
        String nom, dire;
        int tel;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
            nom = teclado.nextLine();
        System.out.println("Ingrese Direccion");
            dire = teclado.nextLine();    
        System.out.println("Ingrese Número de Telefono");
            tel = teclado.nextInt();    
        System.out.println("Nombre"+nom);
        System.out.println("Dirección"+dire);
        System.out.println("Numero de Telefono"+tel);
        
       System.out.println("Nombre: Moises Natanael Recinos A");
       System.out.println("Direccion: Huehuetenango  Zona 4");
       System.out.println("Telefono: 33299869");
        
       System.out.println("Nombre: Victor Daniel Tejeda Hernández");
       System.out.println("Direccion: Huehuetenango  Zona 8");
       System.out.println("Telefono: 34175073");
        
       System.out.println("Nombre: José Alejandro López Ramírez");
       System.out.println("Direccion: Huehuetenango Zona 8");
       System.out.println("Telefono: 55928636");
    }
    
}

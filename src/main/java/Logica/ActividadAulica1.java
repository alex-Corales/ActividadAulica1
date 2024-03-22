/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

/**
 *
 * @author Alex Corales
 */
public class ActividadAulica1 {

    public static void main(String[] args) {

Baraja baraja = new Baraja();
       // System.out.println("cartas disponibles : ");
//baraja.mostrarBaraja();
        System.out.println("---------------------------------------------------------");
        System.out.println("cartas barajadas");
baraja.barajar();
        System.out.println("");
        System.out.println("las cartas disponibles  son :" + baraja.cartasDisponibles());
        baraja.mostrarBaraja();
        System.out.println("---------------------------------------------------------");
        System.out.println(" siguiente carta:" + baraja.siguienteCarta());
        System.out.println("---------------------------------------------------------");
baraja.mostrarBaraja();
        System.out.println("---------------------------------------------------------");
        System.out.println("monton de cartas :");
        baraja.cartasMonton();
        System.out.println("---------------------------------------------------------");
        System.out.println("dar cartas");
        baraja.darCartas(39);
        System.out.println("");
        System.out.println("las cartas disponibles  son :" + baraja.cartasDisponibles());
        System.out.println("---------------------------------------------------------");
        System.out.println("baraja nueva:");
        baraja.mostrarBaraja();
        System.out.println("---------------------------------------------------------");
        System.out.println("como queda el monton de cartas");
        System.out.println(" ");
        baraja.cartasMonton();
        System.out.println("---------------------------------------------------------");
        System.out.println(" ");
        System.out.println("volvemos a barajar las cartas");

        baraja.barajar();
        System.out.println("---------------------------------------------------------");
        System.out.println(" ");
            System.out.println("las cartas disponibles  son :" + baraja.cartasDisponibles());
baraja.mostrarBaraja();
            System.out.println(" ");
baraja.siguienteCarta();
    }
}

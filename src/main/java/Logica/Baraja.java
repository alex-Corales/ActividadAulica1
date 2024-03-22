package Logica;

import java.util.HashSet;

public class Baraja {

    private HashSet<Carta> cartas; // este

    public Baraja(){
        cartas = new HashSet<>();
        initBaraja();
    }
    
    private void initBaraja() {
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(palo, numero));
                }
            }
        }
    }
    
    /* 
        Al ser un HashSet no es necesario barajar la carta 
        por que cuando agrego una carta se guarda de acuerdo a 
        su ubicacion en la tabla hash, o sea no tiene un orden como 
        un arrayList.
        Lo malo es que siempre va a estar ordenado de la misma manera, 
        por que el hash siempre es el mismo para cada carta.
    */    
    public void barajar(){
        //Collections.shuffle(cartas);
    }

    public void siguienteCarta(){

    }

    public void cartasDisponibles(){

    }

    public void darCartas(int cantidad){

    }

    public void cartasMonton(){

    }

    public void mostrarBaraja(){

    }

}

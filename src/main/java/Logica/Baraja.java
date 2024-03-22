package Logica;

import java.util.ArrayList;
import java.util.HashSet;

public class Baraja {

    private ArrayList<Carta> cartas; // este
    private ArrayList<Carta> monton;
    
    public Baraja(){
        cartas = new ArrayList<>();
        monton = new ArrayList<>();
        initBaraja();
    }
    
    private void initBaraja() {
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(palo, numero));
                }
            }
        }
    }
  
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
        for (Carta carta : monton) {
            System.out.println(carta);
        }

    }

    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(carta);
        }

    }

}

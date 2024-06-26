package Logica;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta(){
        if (cartas.isEmpty()) {
            System.out.println("No hay mas cartas en la baraja");
            return null;
        }
        else{
           // return cartas.get(cartas.size(cartas));
            Carta carta = cartas.remove(cartas.size()-1);
            monton.add(carta);
            return carta;
        }
    }

    public int cartasDisponibles(){
        if (cartas.isEmpty()) {
            return 0;
        }
        else return cartas.size();
    }

    public void darCartas(int cantidad){
        if(cantidad > cartas.size()) System.out.println("No hay cartas suficientes");
        else{
            for (int i = 0; i < cantidad; i++) {
                monton.add(cartas.get(cartas.size()-1));
                System.out.println("Se elimino esta carta: "+ cartas.remove(cartas.size()-1));
            }
        }
        
    }

    public void cartasMonton(){
        if(cartas.size()>0){
            for (Carta carta : monton) {
            System.out.println(carta);
            }
        }else{
            System.out.println("No hay ninguna carta en el monton");
        }
        
    }

    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(carta);
        }

    }

}

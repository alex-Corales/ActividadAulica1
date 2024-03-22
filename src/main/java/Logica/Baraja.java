package Logica;

import java.util.HashSet;

public class Baraja {

    private ArrayList<Carta> cartas; // este

    public Baraja(){
        cartas = new ArrayList<>();
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

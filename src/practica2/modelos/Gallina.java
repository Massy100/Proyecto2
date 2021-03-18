/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.modelos;

/**
 *
 * @author Massielle Coti
 */
public class Gallina extends Animal{
    private int huevos;
    private int pollitos;

    public Gallina(double Precio, int tiempoMorirVejez, int cantidadComer, int tiempoCrecer, int cantidadEspacio, boolean Destazable, String Tipo, int Edad, int Carne, int tiempoMorirHambre, int recibirCarinio, String Especie, boolean Vivo) {
        super(Precio, tiempoMorirVejez, cantidadComer, tiempoCrecer, cantidadEspacio, Destazable, Tipo, Edad, Carne, tiempoMorirHambre, recibirCarinio, Especie, Vivo);
    }

   



    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    public int getPollitos() {
        return pollitos;
    }

    public void setPollitos(int pollitos) {
        this.pollitos = pollitos;
    }
    
}

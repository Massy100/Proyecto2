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
public class Vaca extends Animal{
    private int leche;
    private int cuero;

    public Vaca(double Precio, int tiempoMorirVejez, int cantidadComer, int tiempoCrecer, int cantidadEspacio, boolean Destazable, String Tipo, int Edad, int Carne, int tiempoMorirHambre, int recibirCarinio, String Especie, boolean Vivo) {
        super(Precio, tiempoMorirVejez, cantidadComer, tiempoCrecer, cantidadEspacio, Destazable, Tipo, Edad, Carne, tiempoMorirHambre, recibirCarinio, Especie, Vivo);
    }

   


    public int getLeche() {
        return leche;
    }

    public void setLeche(int leche) {
        this.leche = leche;
    }

    public int getCuero() {
        return cuero;
    }

    public void setCuero(int cuero) {
        this.cuero = cuero;
    }
    
    
}

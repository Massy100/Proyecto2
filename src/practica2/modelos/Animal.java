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
public class Animal {

private double Precio;
private int tiempoMorirVejez;
private int cantidadComer;
private int tiempoCrecer;
private int cantidadEspacio;
private boolean Destazable;
private String Tipo;
private int Edad;
private int Carne;
private int tiempoMorirHambre;
private int recibirCarinio;
private String Especie;
private boolean Vivo;

    public Animal(double Precio, int tiempoMorirVejez, int cantidadComer, int tiempoCrecer, int cantidadEspacio, boolean Destazable, String Tipo, int Edad, int Carne, int tiempoMorirHambre, int recibirCarinio, String Especie, boolean Vivo) {
        this.Precio = Precio;
        this.tiempoMorirVejez = tiempoMorirVejez;
        this.cantidadComer = cantidadComer;
        this.tiempoCrecer = tiempoCrecer;
        this.cantidadEspacio = cantidadEspacio;
        this.Destazable = Destazable;
        this.Tipo = Tipo;
        this.Edad = Edad;
        this.Carne = Carne;
        this.tiempoMorirHambre = tiempoMorirHambre;
        this.recibirCarinio = recibirCarinio;
        this.Especie = Especie;
        this.Vivo = Vivo;
    }



}

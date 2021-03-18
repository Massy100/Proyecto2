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
public class Planta {
private double precioSemillas;
private int cantidadsemillas;
private int tiempoPudrir;
private int tiempoCrecer;
private int cantidadEspacio;
private int tipo;
private int recibirCarinio;
private int recibirFertilizante;
private boolean vivo;
private String especie;
private int produccion;
private int tiempoMorirVejez;

    public Planta(double precioSemillas, int cantidadsemillas, int tiempoPudrir, int tiempoCrecer, int cantidadEspacio, int tipo, int recibirCarinio, int recibirFertilizante, boolean vivo, String especie, int produccion, int tiempoMorirVejez) {
        this.precioSemillas = precioSemillas;
        this.cantidadsemillas = cantidadsemillas;
        this.tiempoPudrir = tiempoPudrir;
        this.tiempoCrecer = tiempoCrecer;
        this.cantidadEspacio = cantidadEspacio;
        this.tipo = tipo;
        this.recibirCarinio = recibirCarinio;
        this.recibirFertilizante = recibirFertilizante;
        this.vivo = vivo;
        this.especie = especie;
        this.produccion = produccion;
        this.tiempoMorirVejez = tiempoMorirVejez;
    }

    public double getPrecioSemillas() {
        return precioSemillas;
    }

    public void setPrecioSemillas(double precioSemillas) {
        this.precioSemillas = precioSemillas;
    }

    public int getCantidadsemillas() {
        return cantidadsemillas;
    }

    public void setCantidadsemillas(int cantidadsemillas) {
        this.cantidadsemillas = cantidadsemillas;
    }

    public int getTiempoPudrir() {
        return tiempoPudrir;
    }

    public void setTiempoPudrir(int tiempoPudrir) {
        this.tiempoPudrir = tiempoPudrir;
    }

    public int getTiempoCrecer() {
        return tiempoCrecer;
    }

    public void setTiempoCrecer(int tiempoCrecer) {
        this.tiempoCrecer = tiempoCrecer;
    }

    public int getCantidadEspacio() {
        return cantidadEspacio;
    }

    public void setCantidadEspacio(int cantidadEspacio) {
        this.cantidadEspacio = cantidadEspacio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getRecibirCarinio() {
        return recibirCarinio;
    }

    public void setRecibirCarinio(int recibirCarinio) {
        this.recibirCarinio = recibirCarinio;
    }

    public int getRecibirFertilizante() {
        return recibirFertilizante;
    }

    public void setRecibirFertilizante(int recibirFertilizante) {
        this.recibirFertilizante = recibirFertilizante;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public int getTiempoMorirVejez() {
        return tiempoMorirVejez;
    }

    public void setTiempoMorirVejez(int tiempoMorirVejez) {
        this.tiempoMorirVejez = tiempoMorirVejez;
    }

    


}

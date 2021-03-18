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
public class Granjero {
    private String Nombre;
    private String Nickname;
    private int Vida;
    private  double Oro;

    public Granjero(String Nombre, String Nickname, int Vida, double Oro) {
        this.Nombre = Nombre;
        this.Nickname = Nickname;
        this.Vida = Vida;
        this.Oro = Oro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public double getOro() {
        return Oro;
    }

    public void setOro(double Oro) {
        this.Oro = Oro;
    }
    
    
}

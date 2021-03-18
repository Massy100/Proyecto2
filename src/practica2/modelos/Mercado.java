/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.modelos;

import practica2.gui.Usuario;

/**
 *
 * @author Massielle Coti
 */
public class Mercado {
    private Usuario usuario1;
    private Vaca[] vaca1;
    private Cabra[] cabra1;
    private Gallina[] gallina1;
    private Ganso[] ganso1;
    private Maiz[] maiz1;
    private Soya[] soya1;
    private Manzano[] manzano1;
    private Duraznal[] duraznal1;

    public Mercado(Usuario usuario1, Vaca[] vaca1, Cabra[] cabra1, Gallina[] gallina1, Ganso[] ganso1, Maiz[] maiz1, Soya[] soya1, Manzano[] manzano1, Duraznal[] duraznal1) {
        this.usuario1 = usuario1;
        this.vaca1 = vaca1;
        this.cabra1 = cabra1;
        this.gallina1 = gallina1;
        this.ganso1 = ganso1;
        this.maiz1 = maiz1;
        this.soya1 = soya1;
        this.manzano1 = manzano1;
        this.duraznal1 = duraznal1;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Vaca[] getVaca1() {
        return vaca1;
    }

    public void setVaca1(Vaca[] vaca1) {
        this.vaca1 = vaca1;
    }

    public Cabra[] getCabra1() {
        return cabra1;
    }

    public void setCabra1(Cabra[] cabra1) {
        this.cabra1 = cabra1;
    }

    public Gallina[] getGallina1() {
        return gallina1;
    }

    public void setGallina1(Gallina[] gallina1) {
        this.gallina1 = gallina1;
    }

    public Ganso[] getGanso1() {
        return ganso1;
    }

    public void setGanso1(Ganso[] ganso1) {
        this.ganso1 = ganso1;
    }

    public Maiz[] getMaiz1() {
        return maiz1;
    }

    public void setMaiz1(Maiz[] maiz1) {
        this.maiz1 = maiz1;
    }

    public Soya[] getSoya1() {
        return soya1;
    }

    public void setSoya1(Soya[] soya1) {
        this.soya1 = soya1;
    }

    public Manzano[] getManzano1() {
        return manzano1;
    }

    public void setManzano1(Manzano[] manzano1) {
        this.manzano1 = manzano1;
    }

    public Duraznal[] getDuraznal1() {
        return duraznal1;
    }

    public void setDuraznal1(Duraznal[] duraznal1) {
        this.duraznal1 = duraznal1;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.manejadores;

/**
 *
 * @author Massielle Coti
 */
public class ManejadorGui {
    static int MAX = 1;
    static int a1[] = new int[MAX];
    
    
    static void generarAleatorios(int a[]) {
    for (int i = 0; i < 25; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
    }
    }
}

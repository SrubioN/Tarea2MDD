/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremfigther.luchadores;

/**
 *
 * @author Potro69
 */
public class NiñoNoPeleen extends DecoradorAcompanante {

    Luchador luchador;

    public NiñoNoPeleen(Luchador luchador) {
        this.luchador = luchador;
    }

    public String nombre() {
        return luchador.nombre() + "NIÑO NO PELEEN";
    }

    public int usarMovimientoEspecial() {
        return luchador.usarMovimientoEspecial() + 25;
    }

}

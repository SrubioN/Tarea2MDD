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
public class NiñoIluminati extends DecoradorAcompanante {
    Luchador luchador;
    public NiñoIluminati(Luchador luchador){
    this.luchador = luchador;
    }
        public String nombre(){
            return luchador.nombre()+"NIÑO ILUMINATIII";
        }
    
    
	public int usarMovimientoEspecial(){
		return luchador.usarMovimientoEspecial()+40;
	}
    
}

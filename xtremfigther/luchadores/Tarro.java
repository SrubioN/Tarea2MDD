/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremfigther.luchadores;

/**
 *
 * @author Beps
 */
public class Tarro extends DecoradorAcompanante{
    
    Luchador luchador;
    public Tarro(Luchador luchador){
      //  System.out.println(luchador.nombre);
    this.luchador = luchador;
   this.luchador.nombre=luchador.nombre;
    }
    
    
    
    
    @Override
       public String nombre() {
        return luchador.nombre() + " TARRO,";
    }

    
    @Override
	public int usarMovimientoEspecial(){
		return luchador.usarMovimientoEspecial()+25;
	}
}

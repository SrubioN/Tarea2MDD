
package xtremfigther.luchadores;
import xtremfigther.poderes.MovimientoEspecial;


public class Luchador {
    public String nombre="Nombre por defecto";
    
    
	public String nombre(){
            return nombre;
        };
        
        
        
	public MovimientoEspecial miMovimiento;
	public String golpear(){
		return "GOLPE POR DEFECTOOOO";
		};
	public String patear(){
		return "PATADA POR DEFECTOOO!";
		}
	public String saltar(){
		return "SALTO POR DEFECTOOOO";
		}
	public int usarMovimientoEspecial(){
		return miMovimiento.ejecutarMovimientoEspecial();
	}
}

package xtremfigther;

import java.util.Scanner;

import xtremfigther.poderes.Agarrador;
import xtremfigther.poderes.AtacadorRapido;
import xtremfigther.poderes.LanzaPoderes;
import xtremfigther.poderes.MovimientoEspecial;
import xtremfigther.luchadores.ChoroPortenho;
import xtremfigther.luchadores.GorrionDeConchali;
import xtremfigther.luchadores.HalconDeChicureo;
import xtremfigther.luchadores.Luchador;
import xtremfigther.luchadores.MineroWarrior;
import xtremfigther.luchadores.NiñoIluminati;
import xtremfigther.luchadores.NiñoNoPeleen;
import xtremfigther.luchadores.PanchoDelSur;
import xtremfigther.luchadores.Tarro;

public class FightEngine {
	public FightEngine(){
		String luchadorPlayer1;
		String accionLuchadorIn;
                String str;
                Luchador luchador =null;
		    
                System.out.println("Empieza el juego!!! ñore");
		System.out.println("Selecciona tu luchador (1, 2, 3, 4, 5): 1-Choro Portenho 2-Minero Warrior  3-Halcon de Chicureo  4-Gorrion de Conchali  5-Pancho del Sur");
		Scanner seleccion = new Scanner(System.in);
                luchadorPlayer1 = seleccion.nextLine();
                
                MovimientoEspecial nuevoMovimiento=null;
                
                switch(luchadorPlayer1){
                    case "1":
                        luchador = new ChoroPortenho();
                        nuevoMovimiento = new LanzaPoderes();
                        break;
                }
                switch(luchadorPlayer1){
                    case "2":
                        luchador = new MineroWarrior();
                        nuevoMovimiento = new AtacadorRapido();
                        break;
                }
                switch(luchadorPlayer1){
                    case "3":
                        luchador = new HalconDeChicureo();
                        nuevoMovimiento = new LanzaPoderes();
                        break;
                }
                switch(luchadorPlayer1){
                    case "4":
                        luchador = new GorrionDeConchali();
                        nuevoMovimiento = new AtacadorRapido();
                        break;
                }
                switch(luchadorPlayer1){
                    case "5":
                        luchador = new PanchoDelSur();
                        nuevoMovimiento = new Agarrador();
                        break;
                }
                
                luchador.miMovimiento=nuevoMovimiento;
                Luchador aux;
                aux=luchador;
                System.out.println("Selecciona tu luchador de Apoyo (1, 2, 3): 1-Tarro 2-Nino Illuminati 3-Nino no peleen");
                System.out.println("Para finalizar la seleccion presione 0");
                Scanner apoyo = new Scanner(System.in);
                str = apoyo.nextLine();
                while(!str.equals("0")){
                    switch(str){
                        case "1":
                            luchador = new Tarro(luchador);
                            break;
                        case "2":
                            luchador = new NiñoIluminati(luchador);
                            break;
                        case "3":
                            luchador = new NiñoNoPeleen(luchador);
                            break;
                        
                    }
                    System.out.println("Selecciona tu luchador de Apoyo (1, 2, 3): 1-Tarro 2-Nino Illuminati 3-Nino no peleen");
                    System.out.println("Para finalizar la seleccion presione 0");
                    str = apoyo.nextLine();
                }
                
                System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
                
                accionLuchadorIn =seleccion.nextLine();
              
                    switch(accionLuchadorIn) {
				case "1": System.out.println(aux.golpear());
					break;
                                case "2": System.out.println(aux.patear());
							break;
                                case "3": System.out.println(aux.saltar());
							break;
                                case "4": System.out.println(luchador.usarMovimientoEspecial()+" "+luchador.nombre());
							break;				
				}
                                                
                
				
		
				
		System.out.println("FIN DEL JUEGO.");

	}

}

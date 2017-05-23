package xtremfigther.luchadores;

public class ChoroPortenho extends Luchador {
    public String Nombre() {
        this.nombre="CHORO PORTENHO!!!!";
        return  this.nombre;
    }

    @Override
    public String golpear() {
        return ("ALETAZO MARINO!!!");
    }

    @Override

    public String patear() {
        return ("PATADA DE LA JAIBAAAAA!!!");
    }

    @Override
    public String saltar() {
        return ("PIQUERO INFERNAAAAAL!!!");
    }

}

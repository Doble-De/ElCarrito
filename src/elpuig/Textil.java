package elpuig;

public class Textil extends Productos {
    String composicion;

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public double PrecioFinalT(){

        return getPreu();
    }

}

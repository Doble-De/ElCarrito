package elpuig;

public class Textil extends Productos {

    String composicion;

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public double getpreu() {
        return preu;
    }

    public void setpreu(double preu) {
        this.preu = preu;
    }

    public int getcodi() {
        return codi_barres;
    }
    public void setcodi (int codi) {
        this.codi_barres = codi;
    }

}

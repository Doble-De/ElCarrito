package elpuig;

public class Electronica extends Productos{

    int diesGarantia;

    public double getDiesGarantia() {
        return diesGarantia;
    }

    public void setDiesGarantia(int diesGarantia) {
        this.diesGarantia = diesGarantia;
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

    public void setcodi(int codi) {
        this.codi_barres = codi;
    }

    public double PrecioFinalE(){

        double preciofinal = getpreu()+getpreu()*(getDiesGarantia()/365)*0.1;

        return preciofinal;
    }
}

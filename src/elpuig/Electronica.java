package elpuig;

public class Electronica extends Productos {

    int diesGarantia;
    public int getDiesGarantia() {
        return diesGarantia;
    }

    public void setDiesGarantia(int diesGarantia) {
        this.diesGarantia = diesGarantia;
    }


    public void PrecioFinalE(){

        setPreu(getPreu()+getPreu()*(getDiesGarantia()/365)*0.1);
    }
}

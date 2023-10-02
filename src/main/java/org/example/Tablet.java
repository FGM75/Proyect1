package org.example;

public class Tablet extends Dispositivo implements GammaAlta{
    int numPulsades;
    public Tablet(String marca, String modelo, double precio, int numPulsades) {
        super(marca, modelo, precio);
        this.numPulsades = numPulsades;
    }

    public int getNumPulsades() {
        return numPulsades;
    }

    public void setNumPulsades(int numPulsades) {
        this.numPulsades = numPulsades;
    }

    @Override
    public boolean isGammaAlta() {
        if (this.precioFinal()>=900){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return   "Tablet{" + super.toString() +
                ", numPulsades=" + numPulsades +
                '}';
    }
}


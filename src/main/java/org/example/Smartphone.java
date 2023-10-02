package org.example;

public class Smartphone extends Dispositivo implements GammaAlta{

    private String sistemaOperativo;
    private boolean accelerometro = false;
    private boolean gps = true;


    public Smartphone(String marca, String modelo, double precio,
                      String sistemaOperativo) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public Smartphone(String marca, String modelo, double precio,
                      String sistemaOperativo, boolean accelerometro, boolean gps) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.accelerometro = accelerometro;
        this.gps = gps;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean isAccelerometro() {
        return accelerometro;
    }

    public void setAccelerometro(boolean accelerometro) {
        this.accelerometro = accelerometro;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
    @Override
    public double precioFinal() {
        if (isAccelerometro()){
            if (isGps()) this.setPrecio(this.getPrecio() * 1.15);
            else this.setPrecio(this.getPrecio() * 1.10);
        }
        return this.getPrecio();
    }

    @Override
    public boolean isGammaAlta() {
        if (this.precioFinal()>=700){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "Smartphone{" + super.toString() +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", accelerometro=" + accelerometro +
                ", gps=" + gps +
                '}';
    }
}
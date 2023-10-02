package org.example;

public class Otros extends Dispositivo{
    String descripcion;

    public Otros(String marca, String modelo, double precio,String descripcion) {
        super(marca, modelo, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Otros{" + super.toString() +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

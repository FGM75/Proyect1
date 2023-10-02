package org.example;

public class Main {


    public static void main(String[] args) {
        Otros reloj = new Otros("Apple","12",100,"Reloj intelijente");
        Smartphone android = new Smartphone("Android","14",300,
                "Android",false,false);
        Smartphone iphone = new Smartphone("Apple","7",500,
                "IOS",true,true);
        Tablet tablet = new Tablet("Apple","Nuevo",400,400);
        Otros satisfactorio = new Otros("Amazon","1",80,"Increible");

        System.out.println(reloj.toString() + "\n" + android.toString() + "\n"+
                iphone.toString() + "\n" + tablet.toString() + "\n" + satisfactorio.toString());

        System.out.println(reloj.precioFinal() + "\n" + android.precioFinal() + "\n"+
                iphone.precioFinal() + "\n" + tablet.precioFinal() + "\n" + satisfactorio.precioFinal());

        System.out.println(android.isGammaAlta() + "\n" + iphone.isGammaAlta() + "\n" +
                tablet.isGammaAlta());
    }

}
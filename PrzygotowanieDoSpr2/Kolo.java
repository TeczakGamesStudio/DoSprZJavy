package PrzygotowanieDoSpr2;

import java.text.DecimalFormat;

public class Kolo extends Figura{
    private double promien;
    private double pole;

    public Kolo(String nazwa, String kolor){
        super(nazwa,kolor);
    }

    public void Pole(double promien){
        pole=Math.PI*Math.pow(promien,2);
        this.promien=promien;
    }

    public void Wyswietl(){
        super.Wyswietl();
        System.out.println("Promien: "+promien);
        System.out.println("Pole: "+pole);
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "promien=" + promien +
                ", pole=" + pole +
                '}';
    }
}

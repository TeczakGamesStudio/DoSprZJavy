package PrzygotowanieDoSpr2;

public class Figura {
    private String nazwa;
    private  String kolor;

    public Figura(String nazwa, String kolor) {
        this.nazwa = nazwa;
        this.kolor = kolor;
    }

    public void Wyswietl(){
        System.out.println("Figury geometryczne");
        System.out.println("Nazwa: "+nazwa);
        System.out.println("Kolor: "+kolor);
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nazwa='" + nazwa + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

}

package PrzygotowanieDoTestu;

public class Pilkarz extends Osoba{

    private String klub;
    private String pozycja;
    private int liczba_goli;

    public Pilkarz(String imie, String nazwisko, String data_uro, String klub, String pozycja) {
        super(imie, nazwisko, data_uro);
        this.klub = klub;
        this.pozycja = pozycja;
        this.liczba_goli=0;
    }

    public void StrzelGola(){
       this.liczba_goli++;
    }

    public void WypiszInfo(String imie, String nazwisko, String dataUr, String klub,String pozycja,int liczba_goli){
       super.WypiszInfo(imie,nazwisko,dataUr);
        System.out.print("z klubu "+klub+"na pozycji "+pozycja+" liczba strzelonych goli: "+liczba_goli);
    }

    public int getLiczba_goli() {
        return liczba_goli;
    }

    @Override
    public String toString() {
        return "Pilkarz{" +
                "klub='" + klub + '\'' +
                ", pozycja='" + pozycja + '\'' +
                ", liczba_goli=" + liczba_goli +
                '}';
    }
}

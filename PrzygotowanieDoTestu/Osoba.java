package PrzygotowanieDoTestu;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String data_uro;

    //

    public Osoba(String imie, String nazwisko, String data_uro) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_uro = data_uro;
    }

    public void WypiszInfo(String imie, String nazwisko, String datauro){
        System.out.print("Pilkarz "+imie +" "+nazwisko +" urodzony "+datauro+" ");
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data_uro='" + data_uro + '\'' +
                '}';
    }
}

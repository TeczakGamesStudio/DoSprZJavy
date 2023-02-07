package PrzygotowanieDoTestu;

public class Start {
    public static void main(String[] args) {
        Pilkarz pil = new Pilkarz(null,null,null,null,null);
        pil.StrzelGola();
        pil.WypiszInfo("Karol","Modny","25-05-2000","Trampkarze","Napastnik", pil.getLiczba_goli());

    }
}

package harj_9;

public class Sõitja {
    private String nimi;
    private int vanus;

    public Sõitja(String nimi, int vanus) {
        this.nimi = nimi;
        this.vanus = vanus;
    }

    public void treeni(int tundideArv) {
        vanus -= tundideArv / 10;
    }

    public void kuvaAndmed() {
        System.out.println("Sõitja: " + nimi);
        System.out.println("Vanus: " + vanus + " aastat");
    }
}

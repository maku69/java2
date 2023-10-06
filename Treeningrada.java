package harj_9;

public class Treeningrada {
    private String nimi;
    private int pikkus;

    public Treeningrada(String nimi, int pikkus) {
        this.nimi = nimi;
        this.pikkus = pikkus;
    }

    public void kuvaAndmed() {
        System.out.println("Treeningrada: " + nimi);
        System.out.println("Pikkus: " + pikkus + " km");
    }
}

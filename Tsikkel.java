package harj_9;

public class Tsikkel {
    private String mark;
    private String mudel;
    private int aasta;
    private int kiirus;

    public Tsikkel(String mark, String mudel, int aasta, int kiirus) {
        this.mark = mark;
        this.mudel = mudel;
        this.aasta = aasta;
        this.kiirus = kiirus;
    }

    public void kiirenda() {
        kiirus += 10;
    }

    public void kuvaAndmed() {
        System.out.println("Tsikkel: " + mark + " " + mudel + " (" + aasta + ")");
        System.out.println("Hetkeseis: Kiirus " + kiirus + " km/h");
    }
}

package harj_9;

import java.util.List;

public class Motoklubi {
    private List<Tsikkel> tsiklid;
    private List<Sõitja> sõitjad;
    private List<Treeningrada> treeningradad;

    public Motoklubi(List<Tsikkel> tsiklid, List<Sõitja> sõitjad, List<Treeningrada> treeningradad) {
        this.tsiklid = tsiklid;
        this.sõitjad = sõitjad;
        this.treeningradad = treeningradad;
    }

    public void korraldaTreening() {
        for (Sõitja sõitja : sõitjad) {
            sõitja.treeni(2);
        }
        System.out.println("Treening lõppenud!");
    }

    public static void main(String[] args) {
        // Loome mõned tsiklid
        Tsikkel tsikkel1 = new Tsikkel("Honda", "CBR600RR", 2022, 250);
        Tsikkel tsikkel2 = new Tsikkel("Kawasaki", "Ninja ZX-10R", 2023, 280);

        // Loome mõned sõitjad
        Sõitja sõitja1 = new Sõitja("Maria", 28);
        Sõitja sõitja2 = new Sõitja("Jaan", 35);

        // Loome mõned treeningradad
        Treeningrada rada1 = new Treeningrada("Rada A", 5);
        Treeningrada rada2 = new Treeningrada("Rada B", 7);

        // Loome motoklubi ja lisame sinna tsiklid, sõitjad ja treeningradad
        Motoklubi klubi = new Motoklubi(List.of(tsikkel1, tsikkel2), List.of(sõitja1, sõitja2), List.of(rada1, rada2));

        // Kuva tsiklite, sõitjate ja treeningradade andmed
        System.out.println("Tsiklite andmed:");
        for (Tsikkel tsikkel : klubi.tsiklid) {
            tsikkel.kuvaAndmed();
            System.out.println(); // Lisa tühirida eraldamiseks
        }

        System.out.println("Sõitjate andmed:");
        for (Sõitja sõitja : klubi.sõitjad) {
            sõitja.kuvaAndmed();
            System.out.println(); // Lisa tühirida eraldamiseks
        }

        System.out.println("Treeningradade andmed:");
        for (Treeningrada rada : klubi.treeningradad) {
            rada.kuvaAndmed();
            System.out.println(); // Lisa tühirida eraldamiseks
        }

        // Korraldame treeningu
        klubi.korraldaTreening();
    }
}

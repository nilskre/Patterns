package erbauer;

public class Direktor {

    public static void main(String[] args) {
        // Aufgabe des Direktors den Konstruktionsauftrag zu geben
        Produkt produkt = new KonkreterErbauerImpl(5L).setDescription("Hello").setTitle("Test").build();
        System.out.println(produkt.toString());
    }
}

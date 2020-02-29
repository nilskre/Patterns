package kompositum;

public class MainTest {

    public static void main(String args[]) {
        Komponente department1 = new Blatt(1, "department1");
        Komponente department2 = new Blatt(2, "department2");
        Komponente department3 = new Blatt(3, "department3");
        Komponente department4 = new Blatt(4, "department4");
        Kompositum kompositum = new Kompositum(1, "Root Kompositum");
        Kompositum kompositum2 = new Kompositum(1, "kompositum als Kindelement");

        // Baum aufbauen:
        kompositum.addKomponente(department1);
        kompositum.addKomponente(department2);
        kompositum2.addKomponente(department3);
        kompositum2.addKomponente(department4);
        kompositum.addKomponente(kompositum2);

        System.out.println("Teil des Root Kompositums sind folgende Objekte: ");
        kompositum.printKomponenteName();
        System.out.println("Teil des Child Kompositums sind folgende Objekte: ");
        kompositum2.printKomponenteName();

        // Ergebnis:
        // Teil des Root Kompositums sind folgende Objekte:
        // Blatt: department1
        // Blatt: department2
        // Kompositum: kompositum als Kindelement
        // Teil des Child Kompositums sind folgende Objekte:
        // Blatt: department3
        // Blatt: department4
    }
}

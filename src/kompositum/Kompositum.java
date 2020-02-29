package kompositum;

import java.util.ArrayList;
import java.util.List;

public class Kompositum implements Komponente {

    private Integer id;
    private String name;

    private List<Komponente> komponenten;

    public Kompositum(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.komponenten = new ArrayList<>();
    }

    public void printKomponenteName() {
        komponenten.forEach(Komponente::printObjectName);
    }

    public void addKomponente(Komponente komponente) {
        komponenten.add(komponente);
    }

    public void removeKomponente(Komponente komponente) {
        komponenten.remove(komponente);
    }

    @Override
    public void printObjectName() {
        System.out.println(getClass().getSimpleName() + ": " + this.name);
    }
}

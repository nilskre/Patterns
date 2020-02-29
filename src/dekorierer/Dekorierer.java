package dekorierer;

public abstract class Dekorierer implements Komponente {

    private Komponente komponente;

    public Dekorierer(Komponente komponente) {
        this.komponente = komponente;
    }

    @Override
    public String operation() {
        return komponente.operation();
    }
}

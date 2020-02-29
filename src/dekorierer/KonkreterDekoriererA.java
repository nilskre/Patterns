package dekorierer;

public class KonkreterDekoriererA extends Dekorierer {

    public KonkreterDekoriererA(Komponente komponente) {
        super(komponente);
    }

    public String operation() {
        return super.operation() + decorate();
    }

    private String decorate() {
        return " with decoration A";
    }
}

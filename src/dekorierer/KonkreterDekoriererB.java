package dekorierer;

public class KonkreterDekoriererB extends Dekorierer {

    public KonkreterDekoriererB(Komponente komponente) {
        super(komponente);
    }

    public String operation() {
        return super.operation() + decorate();
    }

    private String decorate() {
        return " with decoration B";
    }
}

package kompositum;

public class Blatt implements Komponente{

    private Integer id;
    private String name;

    public Blatt(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printObjectName() {
        System.out.println(getClass().getSimpleName() + ": " + this.name);
    }
}

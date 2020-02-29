package dekorierer;

public class MainTest {

    public static void main(String[] args) {
        // component decorated with KonkreterDekoriererA
        // "Komponente with decoration A"
        Komponente komponente1 = new KonkreterDekoriererA(new KonkreteKomponenteImpl());
        System.out.println(komponente1.operation());

        // component decorated with KonkreterDekoriererA, KonkreterDekoriererA and KonkreterDekoriererB
        // "Komponente with decoration B with decoration A with decoration A"
        Komponente komponente2 = new KonkreterDekoriererA(new KonkreterDekoriererA(new KonkreterDekoriererB(new KonkreteKomponenteImpl())));
        System.out.println(komponente2.operation());
    }
}

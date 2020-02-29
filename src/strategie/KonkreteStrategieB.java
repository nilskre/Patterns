package strategie;

public class KonkreteStrategieB implements Strategie {
    @Override
    public void führeAus() {
        System.out.println("Konrete Strategie B wird genutzt");
    }
}

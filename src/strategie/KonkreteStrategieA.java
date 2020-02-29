package strategie;

public class KonkreteStrategieA implements Strategie {
    @Override
    public void führeAus() {
        System.out.println("Konrete Strategie A wird genutzt");
    }
}

package strategie;

public class Kontext {

    private Strategie strategie;

    public void macheEtwas(String strategyToUse) {
        if(strategyToUse.equals("A")) {
            this.strategie = new KonkreteStrategieA();
        } else if (strategyToUse.equals("B")) {
            this.strategie = new KonkreteStrategieB();
        }
        this.strategie.führeAus();
    }

    public Kontext(String strategyToUse) {
        macheEtwas(strategyToUse);
    }

    public static void main(String[] args) {
        System.out.println("Nutze Strategie A");
        new Kontext("A");
        System.out.println("\nNutze Strategie B");
        new Kontext("B");
    }
}

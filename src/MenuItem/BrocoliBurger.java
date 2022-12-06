package MenuItem;

public class BrocoliBurger extends Vegies {
    private int gramsOfBrocoli;
    private int gramsOfProvalone;

    public BrocoliBurger() {
        super("Regular", 25, 75, 50, false);
        this.gramsOfBrocoli = 100;
        this.gramsOfProvalone = 125;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + gramsOfBrocoli * 0.4 + gramsOfProvalone * 1.0;
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}
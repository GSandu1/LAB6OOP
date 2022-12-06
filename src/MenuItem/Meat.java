package MenuItem;

public class Meat extends Bun {
    protected int chicken;
    private boolean sausage;


    public Meat(String buntype, int size, int amountOfSouse, int chicken, boolean sausage) {
        super(buntype, size, amountOfSouse);
        this.chicken = chicken;
        this.sausage = sausage;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (chicken * 1.2);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}
package MenuItem;

public class Vegies extends Bun {

    private int tomatoes;
    private boolean broccoli;

    public Vegies(String buntype, int size, int amountOfSouse, int tomatoes, boolean broccoli) {
        super(buntype, size, amountOfSouse);
        this.tomatoes = tomatoes;
        this.broccoli = broccoli;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (tomatoes * 0.5);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}
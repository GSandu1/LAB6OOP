package MenuItem;

public class Bun {

    private String buntype;
    private int size;
    private int amountOfSouse;

    private double price;

    public Bun(String buntype, int size, int amountOfSouse) {
        this.buntype = buntype;
        this.size = size;
        this.amountOfSouse = amountOfSouse;
    }

    public double getPrice() {
        price = 0;
        if (buntype == "Regular") {
            price += 15;
        } else if (buntype == "GlutenFree") {
            price += 20;
        }
        price += size * 1.5;
        price += amountOfSouse * 0.5;
        return price;
    }

    public double costToMake() {
        return getPrice()/2;
    }
}
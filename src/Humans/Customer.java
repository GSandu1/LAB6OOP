package Humans;

import java.util.Random;

public class Customer extends Person{
    Random random = new Random();
    public Customer() {
        super("Customer");
    }

    public int timeBetweenCustomers(double rating) {
        int randTime;
        if(rating<1) {
            randTime = random.nextInt(60) + 1;
        } else if (rating >= 1 && rating < 2) {
            randTime = random.nextInt(50) + 1;
        } else if (rating >= 2 && rating < 3) {
            randTime = random.nextInt(40) + 1;
        } else if (rating >= 3 && rating < 4) {
            randTime = random.nextInt(30) + 1;
        } else if (rating >= 4 && rating < 5) {
            randTime = random.nextInt(20) + 1;
        } else {
            randTime = random.nextInt(10) + 1;
        }
        return randTime;
    }

    public int BurgerOrdered(double rating) {
        int randBurgerAmount;
        if(rating<1) {
            randBurgerAmount = random.nextInt(2) + 1;
        } else if (rating >= 1 && rating < 2) {
            randBurgerAmount = random.nextInt(3) + 1;
        } else if (rating >= 2 && rating < 3) {
            randBurgerAmount = random.nextInt(4) + 1;
        } else if (rating >= 3 && rating < 4) {
            randBurgerAmount = random.nextInt(6) + 1;
        } else if (rating >= 4 && rating < 5) {
            randBurgerAmount = random.nextInt(7) + 1;
        } else {
            randBurgerAmount = random.nextInt(8) + 1;
        }
        return randBurgerAmount;
    }

}
package mvc;

import Humans.Cook;
import Humans.Customer;
import Humans.Restaurant;
import Humans.Waiter;
import MenuItem.*;

import java.util.Random;
import java.util.Scanner;

public class Model implements ModelInterface {
    @Override
    public int getRandomTimeTakeWaiter(Random rand) {
        return rand.nextInt(20) + 1;
    }
    @Override
    public int IsWithSomeone(Random rand) {
        return rand.nextInt(2) + 1;
    }
    @Override
    public int getrandomBurgerType(Random rand) {
        return rand.nextInt(7) + 1;
    }
    @Override
    public int getminute(int minute, int newCustomers) {
        minute += newCustomers;
        return minute;
    }
    @Override
    public boolean isNextDay(int nextDay) {
        return nextDay == 1;
    }
    @Override
    public Cook getCook() {
        return new Cook();
    }
    @Override
    public Waiter getWaiter() {
        return new Waiter();
    }
    @Override
    public Random getRandom() {
        return new Random();
    }
    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    @Override
    public BrocoliBurger getBrocoliBurger() {
        return new BrocoliBurger();
    }
    @Override
    public DiabloBurger getDiabloBurger() {
        return new DiabloBurger();
    }
    @Override
    public BeconAvocadoBurger getBeconAvocadoBurger() {
        return new BeconAvocadoBurger();
    }
    @Override
    public int getPositiveReview(int goodReview) {
        goodReview++;
        return goodReview;
    }
    @Override
    public boolean isDayEnded(int minute) {
        return minute > 480;
    }
    @Override
    public int badReview(int badReview) {
        badReview++;
        return badReview;
    }

//    public void goodRaiting(Restaurant restaurant) {
//        restaurant.setRating(restaurant.getRating() + 0.1);
//    }
    @Override
    public int getGoodReview(int goodReview) {
        goodReview++;
        return goodReview;
    }
    @Override
    public int getBadReview(int badReview) {
        badReview++;
        return badReview;
    }
    @Override
    public double makeBurger(BBQBeconBurger BBQBeconBurger, BeconAvocadoBurger BeconAvocadoBurger,DiabloBurger DiabloBurger, BrocoliBurger BrocoliBurger, double profitDay, int randomBurger, int burgers) {
        switch (randomBurger) {
            case 1:
                profitDay += BBQBeconBurger.getPrice() * burgers;
                break;
            case 2:
                profitDay += BeconAvocadoBurger.getPrice() * burgers;
                break;
            case 3:
                profitDay += DiabloBurger.getPrice() * burgers;
                break;
            case 4:
                profitDay += BrocoliBurger.getPrice() * burgers;
                break;

        }
        return profitDay;
    }

    @Override
    public boolean tooMuchTime(int randomTimeTakeWaiter) {
        return randomTimeTakeWaiter > 15;
    }
    @Override
    public int nrOfBurgers(Restaurant restaurant, Customer customer, int randomIsWithSomeone, int burgers) {
        if (randomIsWithSomeone == 2) {
            burgers = customer.BurgerOrdered(restaurant.getRating());
        }
        return burgers;
    }
    @Override
    public BBQBeconBurger getBBQBeconBurger() {
        return new BBQBeconBurger();
    }
    @Override
    public Customer getCustomer() {
        return new Customer();
    }
    @Override
    public Restaurant getRestaurant() {
        return new Restaurant("Burger House", 5);
    }

}

package mvc;

import Humans.Cook;
import Humans.Customer;
import Humans.Restaurant;
import Humans.Waiter;
import MenuItem.*;

import java.util.Random;
import java.util.Scanner;

public interface ModelInterface {
    int getRandomTimeTakeWaiter(Random rand);

    int IsWithSomeone(Random rand);

    int getrandomBurgerType(Random rand);

    int getminute(int minute, int newCustomers);

    boolean isNextDay(int nextDay);

    Cook getCook();

    Waiter getWaiter();

    Random getRandom();

    Scanner getScanner();


    BrocoliBurger getBrocoliBurger();

    DiabloBurger getDiabloBurger();


    BeconAvocadoBurger getBeconAvocadoBurger();

    int getPositiveReview(int goodReview);

    boolean isDayEnded(int minute);

    int badReview(int badReview);


    int getGoodReview(int goodReview);

    int getBadReview(int badReview);

    double makeBurger(BBQBeconBurger BBQBeconBurger, BeconAvocadoBurger BeconAvocadoBurger,DiabloBurger DiabloBurger, BrocoliBurger BrocoliBurger, double profitDay, int randomBurger, int burgers);


    boolean tooMuchTime(int randomTimeTakeWaiter);

    int nrOfBurgers(Restaurant restaurant, Customer customer, int randomIsWithSomeone, int burgers);

    BBQBeconBurger getBBQBeconBurger();

    Customer getCustomer();

    Restaurant getRestaurant();
}

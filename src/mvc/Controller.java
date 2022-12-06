package mvc;

import Humans.Cook;
import Humans.Customer;
import Humans.Restaurant;
import Humans.Waiter;
import MenuItem.*;

import java.util.Random;

public class Controller implements ControllerInterface {
    ViewInterface view = new View();
    Model model = new Model();

    @Override
    public void display() {
        Restaurant restaurant = model.getRestaurant();

        BBQBeconBurger BBQBeconBurger = model.getBBQBeconBurger();
        BeconAvocadoBurger BeconAvocadoBurger = model.getBeconAvocadoBurger();
        DiabloBurger DiabloBurger = model.getDiabloBurger();
        BrocoliBurger BrocoliBurger = model.getBrocoliBurger();

        Random rand = model.getRandom();

        Customer customer = model.getCustomer();
        Waiter waiter = model.getWaiter();
        Cook cook = model.getCook();

        double profitDay = 0;
        int day = 1;
        int workminutes = 480;
        int minute = 0;
        while (true) {
           int newCustomers = customer.timeBetweenCustomers(restaurant.getRating());

            view.nextCoustomer(newCustomers);

            minute = model.getminute(minute, newCustomers);

            int randomBurger = model.getrandomBurgerType(rand);
            int randomIsWithSomeone = model.IsWithSomeone(rand);
            int burgers = 1;
            burgers = model.nrOfBurgers(restaurant, customer, randomIsWithSomeone, burgers);
            int randomTimeTakeWaiter = model.getRandomTimeTakeWaiter(rand);
            minute += randomTimeTakeWaiter;
            view.condition1(randomTimeTakeWaiter);

                minute += randomTimeTakeWaiter;
                view.rendomTime(randomTimeTakeWaiter);

                view.randomBurger(BBQBeconBurger, BeconAvocadoBurger,DiabloBurger, BrocoliBurger, randomBurger, burgers);
                profitDay = model.makeBurger(BBQBeconBurger, BeconAvocadoBurger, DiabloBurger, BrocoliBurger,profitDay, randomBurger, burgers);
                minute += 15 * (burgers / 2) + (burgers % 2);
                int randomReview = rand.nextInt(3) + 1;
                view.randomReview(randomReview);

            view.border1();
            if (model.isDayEnded(minute)) {
                view.daylyStatistic(restaurant, workminutes, waiter, cook);
                profitDay -= waiter.getSalary(workminutes) + cook.getSalary(workminutes) + restaurant.bills(workminutes);
                view.daylyProfit(profitDay, day);
                day++;

                profitDay = 0;
                minute = 0;

            }
        }
    }

}

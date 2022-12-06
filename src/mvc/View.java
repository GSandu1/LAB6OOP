package mvc;

import Humans.Cook;
import Humans.Restaurant;
import Humans.Waiter;
import MenuItem.*;

public class View implements ViewInterface {
    @Override
    public void randomReview(int randomReview) {
        switch (randomReview) {
            case 1:
                System.out.println("The customer  left a bad review");
                break;
            case 2:
                System.out.println("The customer left no reviews");
                break;
            case 3:
                System.out.println("The customer  left a good review");
                break;
        }
    }

    @Override
    public void nextCoustomer(int newCustomers) {
        System.out.println("Next customer came in " + newCustomers + " minutes");
    }


    @Override
    public void daylyProfit(double profitDay, int day) {
        System.out.println("Profit for day : " + profitDay);
        System.out.println("--------------------------------------------\n");
    }


    @Override
    public void border1() {
        System.out.println("***************\n");
    }

    @Override
    public void daylyStatistic(Restaurant restaurant, int workminutes, Waiter waiter, Cook cook) {
        System.out.println("--------------------------------------------");
        System.out.println("Work day ended");
        System.out.println("The waiter was payed " + waiter.getSalary(workminutes) + " and the cook " + cook.getSalary(workminutes));
        System.out.println("Bill price for this day: " + restaurant.bills(workminutes));
    }

    @Override
    public void randomBurger(BBQBeconBurger BBQBeconBurger, BeconAvocadoBurger BeconAvocadoBurger,DiabloBurger DiabloBurger, BrocoliBurger BrocoliBurger, int randomBurger, int burgers) {
        switch (randomBurger) {
            case 1:
                System.out.println("The customer ordered " + burgers + " BBQBeconBurger pizza");
                System.out.println("Price of the check was: " + BBQBeconBurger.getPrice() * burgers);
                break;
            case 2:
                System.out.println("The customer ordered " + burgers + " BeconAvocadoBurger pizza");
                System.out.println("Price of the check was: " + BeconAvocadoBurger.getPrice() * burgers);
                break;
            case 3:
                System.out.println("The customer ordered " + burgers + " DiabloBurger pizza");
                System.out.println("Price of the check was: " + DiabloBurger.getPrice() * burgers);
                break;
            case 4:
                System.out.println("The customer ordered " + burgers + " BrocoliBurger pizza");
                System.out.println("Price of the check was: " + BrocoliBurger.getPrice() * burgers);
                break;

        }
    }

    @Override
    public void rendomTime(int randomTimeTakeWaiter) {
        System.out.println("Waiter came in " + randomTimeTakeWaiter + " minutes");
    }

    @Override
    public void condition1(int randomTimeTakeWaiter) {
        if (randomTimeTakeWaiter > 15) {
            System.out.println("Waiter took too long and the customers left");
            System.out.println(randomTimeTakeWaiter + " minutes waisted");
        } else {
            if (randomTimeTakeWaiter <= 5) {
                System.out.println("Waiter came very quickly and customers were really satisfied");
            }
        }
    }
}

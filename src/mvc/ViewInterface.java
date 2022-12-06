package mvc;

import Humans.Cook;
import Humans.Restaurant;
import Humans.Waiter;
import MenuItem.*;

public interface ViewInterface {
    void randomReview(int randomReview);
    void nextCoustomer(int newCustomers);


    void daylyProfit(double profitDay, int day);


    void border1();

    void daylyStatistic(Restaurant restaurant, int workminutes, Waiter waiter, Cook cook);

    void randomBurger(BBQBeconBurger BBQBeconBurger, BeconAvocadoBurger BeconAvocadoBurger,DiabloBurger DiabloBurger, BrocoliBurger BrocoliBurger, int randomBurger, int burgers);

    void rendomTime(int randomTimeTakeWaiter);

    void condition1(int randomTimeTakeWaiter);
}

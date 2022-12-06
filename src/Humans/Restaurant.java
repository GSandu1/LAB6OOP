
package Humans;

public class Restaurant {
    private final String name;
    private double rating;
    private double budget;

    public Restaurant(String name, double rating) {
        this.name = name;
        this.rating = rating;

    }


//    public void setBudget(double budget) {
//
//            this.budget = budget;
//    }
//
//    public double getBudget() {
//        return budget;
//    }

    public double getRating() {
        return rating;
    }



    public double bills(double workingminutes) {
        return workingminutes * 5;
    }

}
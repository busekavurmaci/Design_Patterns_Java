package Decorator_Coffee;

public abstract class Beverage {

	String description = "Starbucks Coffee";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

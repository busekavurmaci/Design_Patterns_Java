package Adapter_Bird;
public class Sparrow implements IBird {

    public void fly() {
        System.out.println("Flying");
    }
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }

}

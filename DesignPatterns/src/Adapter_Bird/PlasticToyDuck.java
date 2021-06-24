package Adapter_Bird;

public class PlasticToyDuck implements IToyDuck {
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}

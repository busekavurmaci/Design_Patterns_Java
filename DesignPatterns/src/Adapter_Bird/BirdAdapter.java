package Adapter_Bird;

public class BirdAdapter implements IToyDuck  {

    IBird bird;
    public BirdAdapter(IBird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}

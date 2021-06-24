package Template_Game;

public class BasketBall extends Game{
    @Override
    void initialize() {
        System.out.println("BasketBall Game finished");
    }

    @Override
    void startPlay() {
        System.out.println("BasketBall Game just start playing");
    }

    @Override
    void endPlay() {
        System.out.println("BasketBall Game Started");
    }
}

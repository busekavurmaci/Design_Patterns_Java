package Template_Game;

public class Main {
    public static void main(String[] args) {
        Game game = new BasketBall();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}

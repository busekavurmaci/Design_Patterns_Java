package Template_Game;

public abstract class SandwishTemplate {

    final void makeSandwish(){
        cutBun();
        if(customerWantsMeat()){
            addMeat();
        }
        if(customerWantsCheese()){
            addCheese();
        }
        if(customerWantsVegetables()){
            addVegetables();
        }
        if(customerWantsCondiments()){
            addCondiments();
        }

        wrapTheSandwish();

    }

    public void cutBun(){
        System.out.println("The turkish Sandwish us cut");
    }


    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();


    boolean customerWantsMeat(){
        return true;
    }

    boolean customerWantsCheese(){
        return true;
    }

    boolean customerWantsVegetables(){
        return true;
    }
    boolean customerWantsCondiments(){
        return true;
    }
    public void wrapTheSandwish(){
        System.out.println("Wrap the Turksh Sandwish");
    }
}

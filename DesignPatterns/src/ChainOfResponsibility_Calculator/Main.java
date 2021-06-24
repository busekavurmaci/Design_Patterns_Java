package ChainOfResponsibility_Calculator;

public class Main {
    //this pattern sends data to an object and if that object can't use it, it sends it to any number
    //of other objects that may be able to use it.
    //create 4 objects that can either add, subtract, multiply or divide
    // send 2 numbers and a command and allow these 4 objects to decide which can handle the requested calculation

    public static void main(String[] args) {
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Number request = new Number(4, 2, "add");
        chainCalc1.calculate(request);


    }

}

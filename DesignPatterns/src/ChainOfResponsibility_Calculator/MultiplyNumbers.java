package ChainOfResponsibility_Calculator;

public class MultiplyNumbers implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Number request) {

        if(request.getCalculationWanted() == "Multiply"){
            System.out.println(request.getNumber1() + " x " + request.getNumber2() + " = " + (request.getNumber1() * request.getNumber2()));

        }else {
            nextChain.calculate(request);
        }

    }
}

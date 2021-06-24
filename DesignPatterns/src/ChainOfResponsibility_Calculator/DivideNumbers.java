package ChainOfResponsibility_Calculator;

public class DivideNumbers implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Number request) {

        if(request.getCalculationWanted() == "div"){
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));

        }else {
            System.out.println("Only works for add, sub, mult and div");
        }

    }
}

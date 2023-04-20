package OO.Calculator;

public class RootCalculator extends Calculator{
    public RootCalculator(double a, double b) {
        super(a, b);
    }


    public double SquareRoot() {

        double squareRoot = Math.sqrt(getA());
        return squareRoot;
    }
}

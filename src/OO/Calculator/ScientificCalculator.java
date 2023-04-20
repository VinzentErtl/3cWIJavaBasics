package OO.Calculator;

public class ScientificCalculator  extends Calculator{
    public ScientificCalculator(double a, double b) {
        super(a, b);
    }

    public double Sinus() {
        double sinus = Math.sin(getA());
        return sinus;
    }

    public double Cosinus() {
        double cosinus = Math.cos(getA());
        return cosinus;
    }
}

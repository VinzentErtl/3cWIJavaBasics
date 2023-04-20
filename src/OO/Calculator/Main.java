package OO.Calculator;

public class Main {
    public static void main(String[] args) {


        Calculator calculator1 = new Calculator(13, 34);
        RootCalculator rootCalculator1 = new RootCalculator(9, 5);
        ScientificCalculator trigonometricCalculator1 = new ScientificCalculator(90,50);

        System.out.println(calculator1.getSum());

        System.out.println(calculator1.getSubtraction());

        System.out.println(calculator1.getMultiplication());

        System.out.println(calculator1.getDivision());

        System.out.println("wurzel " + rootCalculator1.SquareRoot());

        System.out.println("sinus " + trigonometricCalculator1.Sinus());

        System.out.println("cosinus " + trigonometricCalculator1.Cosinus());
    }

}

package Laborator5;

public class AppLab5 {
    public static void main(String[] args) {

        // Punctul a)

        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("Rezultat a): " + result);

        // Punctul b)

        AdvancedCalculator advCalc = new AdvancedCalculator(24);

        int advResult = advCalc.divide(2)
                .power(2)
                .root(2)
                .add(10)
                .subtract(2)
                .result();

        System.out.println("Rezultat b): " + advResult);

        int clearResult = advCalc.clear().add(5).result();
        System.out.println("Dupa clear si add(5): " + clearResult);
    }
}

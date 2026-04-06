package Laborator5;

public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int initialState) {
        super(initialState);
    }

    public AdvancedCalculator add(int value) {
        super.add(value);
        return this;
    }
    public AdvancedCalculator subtract(int value) {
        super.subtract(value);
        return this;
    }
    public AdvancedCalculator multiply(int value) {
        super.multiply(value);
        return this;
    }
    public AdvancedCalculator clear() {
        super.clear();
        return this;
    }

    public AdvancedCalculator divide(int value) {
        if (value != 0) {
            this.state /= value;
        }
        else {
            System.out.println(" Nu se poate împărți la 0! ");
        }
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        this.state = (int) Math.pow(this.state, exponent);
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n != 0) {
            this.state = (int) Math.pow(this.state, 1.0 / n);
        }
        else {
            System.out.println(" Ordinul radicalului nu poate fi 0!");
        }
        return this;
    }
}

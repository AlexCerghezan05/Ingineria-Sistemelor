package Laborator5.advanced;

public class DoubleCalculator extends ACalculator {
    public DoubleCalculator(Double nrInitial) {
        this.state = nrInitial;
    }

    protected void init() {
        this.state = 0.0;
    }

    public DoubleCalculator add(Double numar) {
        Double valoareVeche = (Double) this.state;
        this.state = valoareVeche + numar;
        return this;
    }

    public DoubleCalculator subtract(Double numar) {
        Double valoareVeche = (Double) this.state;
        this.state = valoareVeche - numar;
        return this;
    }

    public DoubleCalculator multiply(Double numar) {
        Double valoareVeche = (Double) this.state;
        this.state = valoareVeche * numar;
        return this;
    }

    public DoubleCalculator clear() {
        super.clear();
        return this;
    }
}

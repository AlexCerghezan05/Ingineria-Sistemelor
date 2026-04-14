package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleCalculatorTest {

    @Test
    void add() {
        //Arrange
        DoubleCalculator calculator= new DoubleCalculator();
        calculator.init();
        calculator.add(2.5);
        //Act
        calculator.add(3.2);
        //Assert
        double rezultatAsteptat= 5.7;
        assertEquals(rezultatAsteptat, calculator.result(), 0.001,"2.5 + 3.2 = 5.7");
    }

    @Test
    void subtract() {
        //Arrange
        DoubleCalculator calculator= new DoubleCalculator();
        calculator.init();
        calculator.add(10.5);
        //Act
        calculator.subtract(5.0);
        //Assert
        double rezultatAsteptat= 5.5;
        assertEquals(rezultatAsteptat, calculator.result(), 0.001, "10.5 - 5.0 = 5.5");
    }

    @Test
    void multiply() {
        //Arrange
        DoubleCalculator calculator= new DoubleCalculator();
        calculator.init();
        calculator.add(2.0);
        //Act
        calculator.multiply(-3.5);
        //Assert
        double rezultatAsteptat= -7.0;
        assertEquals(rezultatAsteptat, calculator.result(), 0.001, "2.0 * -3.5 = -7.0");
    }

    @Test
    void divide() {
        //Arrange
        DoubleCalculator calculator= new DoubleCalculator();
        calculator.init();
        calculator.add(10.0);
        //Act
        calculator.divide(4.0);
        //Assert
        double rezultatAsteptat= 2.5;
        assertEquals(rezultatAsteptat, calculator.result(), 0.001, "10.0 / 4.0 = 2.5");
    }

    @Test
    void multiplyByZero() {
        //Arrange
        DoubleCalculator calculator = new DoubleCalculator();
        calculator.init();
        calculator.add(15.5);
        //Act
        calculator.multiply(0.0);

        //Assert
        double rezultatAsteptat = 0.0;
        assertEquals(rezultatAsteptat, calculator.result(), 0.001, "15.5 * 0.0 = 0.0 Tot timpul!");
    }

    @Test
    void divideByZero() {
        //Arrange
        DoubleCalculator calculator = new DoubleCalculator();
        calculator.init();
        calculator.add(10.0);

        //Act
        calculator.divide(0.0);

        //Assert
        double rezultatAsteptat = Double.POSITIVE_INFINITY;
        assertEquals(rezultatAsteptat, calculator.result(), 0.001, "10.0 / 0.0 = infinit fiindca e double ");
    }
}
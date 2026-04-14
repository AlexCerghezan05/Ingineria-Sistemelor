package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NewIntCalculatorTest {

    @Test
    void add() {
        //Arrange
        NewIntCalculator calculator= new NewIntCalculator();
        calculator.init();
        //Act
        calculator.add(15);
        //Assert
        int rezultatAsteptat=15;
        assertEquals(rezultatAsteptat, calculator.result() , "0 + 15 ar trebui să fie 15");
    }


    @Test
    void subtract() {
        //Arrange
        NewIntCalculator calculator= new NewIntCalculator();
        calculator.init();
        calculator.add(20);
        //Act
        calculator.subtract(5);
        //Assert
        int rezultatAsteptat= 15;
        assertEquals(rezultatAsteptat, calculator.result(),"20-5 ar trebui sa dea 15");
    }

    @Test
    void multiply() {
        //Arrange
        NewIntCalculator calculator= new NewIntCalculator();
        calculator.init();
        calculator.add(4);
        //Act
        calculator.multiply(3);
        //Assert
        int rezultatAsteptat= 12;
        assertEquals(rezultatAsteptat, calculator.result(), "4*3 ar trebui sa fie 12");

    }

    @Test
    void divide() {
        //Arrange
        NewIntCalculator calculator= new NewIntCalculator();
        calculator.init();
        calculator.add(20);
        //Act
        calculator.divide(4);
        //Assert
        int rezultatAsteptat= 5;
        assertEquals(rezultatAsteptat, calculator.result() ,"20/4 ar trebui sa fie 5" );
    }
}
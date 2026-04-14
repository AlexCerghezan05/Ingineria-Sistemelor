package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void multiplybyzero(){
        //Arrange
        NewIntCalculator calculator= new NewIntCalculator();
        calculator.init();
        calculator.add(15);
        //Act
        calculator.multiply(0);
        //Assert
        assertEquals(0, calculator.result() ,"15 *  0 = 0 tot timpul!" );
    }

    @Test
    void dividebyzero(){
        //Arrange
        NewIntCalculator calculator= new NewIntCalculator();
        calculator.init();
        calculator.add(30);
        //Act si Assert
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0);
        }, "Împărțirea la 0 la numere întregi trebuie să arunce ArithmeticException!");

    }
}
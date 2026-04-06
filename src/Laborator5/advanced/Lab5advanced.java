package Laborator5.advanced;

public class Lab5advanced {
    public static void main(String[] args){
        //Punctul a)

        NewIntCalculator calcInt = new NewIntCalculator(10);

        calcInt.add(5)
                .subtract(3)
                .multiply(2);

        System.out.println(" Rezultatul (10 + 5 - 3) * 2 = " + calcInt.result());

        //Punctul b)

        DoubleCalculator calcDouble = new DoubleCalculator(10.0);

        calcDouble.add(5.0)
                .subtract(3.3)
                .multiply(2.2);

        System.out.println(" Rezultatul (10 + 5 - 3.3) * 2.2 = " + calcDouble.result());
    }
}


package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class StandardCalculatorTest {

    private StandardCalculator standardCalculator;


    @BeforeEach

    void setup(){

        standardCalculator = new StandardCalculator();

    }


    @Test

    @DisplayName("Test Addition of Two Doubles")

    void testAdditionOperation(){

        standardCalculator.add(1.5,1.5);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(3, actualResult);

    }


    @Test

    @DisplayName("Test Subtraction of Two Doubles")

    void testSubtractionOperation(){

        standardCalculator.subtract(1,1);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(0, actualResult);

    }

    @Test

    @DisplayName("Test multiplication of Two Doubles")

    void testMultiplicationOperation(){

        standardCalculator.multiply(1,1);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(1, actualResult);

    }

    @Test

    @DisplayName("Test Division of Two Doubles")

    void testDivisionOperation(){

        standardCalculator.divide(1,1);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(1, actualResult);

    }

    
@Test

@DisplayName("Test Addition Overflow of Two Doubles")

void testAdditionOverflowForDoubles(){

    //Assert

    Assertions.assertThrows(ArithmeticException.class,new Executable(){

        @Override

        public void execute() throws Throwable{

            standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);

        }

    });

}


@Test

@DisplayName("Test Subtraction Overflow of Two Doubles")

void testSubtractionOverflowForDoubles(){

    //Assert

    Assertions.assertThrows(ArithmeticException.class,new Executable(){

    @Override

    public void execute() throws Throwable{

            standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);

        }

    });

}

@Test

   @DisplayName("Test Division Divide By Zero Scenario")

   void testDivisionDivideByZero(){

       //Assert

       Assertions.assertThrows(ArithmeticException.class,new Executable(){

           @Override

           public void execute() throws Throwable{

               standardCalculator.divide(10,0);

           }

       });

   }


    


}



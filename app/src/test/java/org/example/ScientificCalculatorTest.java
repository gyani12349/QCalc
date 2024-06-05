package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ScientificCalculatorTest {

    private ScientificCalculator scientificCalculator;

    @BeforeEach

    void setup(){

        scientificCalculator = new ScientificCalculator();

    }


    @Test

    @DisplayName("Test for SQUARE")

    void testSQUARE(){

        //Arrange

        double expectedResult = 4;

        //Act

        scientificCalculator.square(2);

        double actualResult = scientificCalculator.getResult();

        //Assert

        Assertions.assertEquals(expectedResult, actualResult);

    }
}

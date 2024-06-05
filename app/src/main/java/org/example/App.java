/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        System.out.println("Starting QCalc..");
        
        // StandardCalculator calc = new StandardCalculator();
        // calc.add(Double.MAX_VALUE,1);
        // calc.printResult();

        LogicCalculator calc = new LogicCalculator();
        calc.OR(8, 6);
        calc.printResult(); 
    }
}
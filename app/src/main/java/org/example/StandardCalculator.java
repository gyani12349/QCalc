package org.example;

public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }


//Private variable so as to remember the result of the last operation
//Protected variable (changed from private) so as to other classes to access it which inherits this class
protected double result;

public double getResult() {
    return result;
}

public void printResult(){
    System.out.println("Standard Calculator Result:"+ result);

}

//This setter method acts as a 'C' or 'AC' function of an calculator but we are using clearResult() to keep things simple
public void setResult(int value) {
    if (value != 0)
           return;

    this.result = value;
}

public void clearResult() {

    result = 0;

}

public final void add(int num1, int num2){
    result = num1+num2;
}


public final void subtract(int num1, int num2){
    result = num1-num2;
}


public final void multiply(int num1, int num2){
    result = num1*num2;
}


public final void divide(int num1, int num2){
    result = num1/num2;
}

public final void add(double num1, double num2){

    double result = num1 + num2;

    if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}

public final void subtract(double num1, double num2){
    double result = num1 - num2;

    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;
}


public final void multiply(double num1, double num2){
    double result = num1 * num2;

    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;
}


public final void divide(double num1, double num2){
    double result = num1 / num2;

    if(num2==0){

        throw new ArithmeticException("Divided by 0");

    }

    this.result = result;}
    
}

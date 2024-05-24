package at.mklestil.calculatorjavafx.model;

public class MathModel {
    public MathModel() {
    }

    public double getMath(double numb1, double numb2, String operator){
        switch (operator){
            case "+":
                return addition(numb1, numb2);

            case "-":
                return subtract(numb1, numb2);

            case "*":
                return multiply(numb1, numb2);

            case "/":
                return divide(numb1, numb2);

            default:
                return 0;
        }

    }

    public double addition(double numb1, double numb2){
        return numb1 + numb2;
    }

    public double subtract (double numb1, double numb2){
        return  numb1 - numb2;
    }

    public double multiply (double numb1, double numb2){
        return numb1 * numb2;
    }

    public  double divide (double numb1, double numb2){
        return numb1 / numb2;
    }
}

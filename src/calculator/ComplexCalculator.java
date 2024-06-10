package calculator;

public class ComplexCalculator {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        ComplexOperation addition = ComplexOperationFactory.createOperation("add");
        ComplexNumber resultAdd = addition.execute(a, b);
        System.out.println("Addition result: " + resultAdd);

        ComplexOperation multiplication = ComplexOperationFactory.createOperation("multiply");
        ComplexNumber resultMultiply = multiplication.execute(a, b);
        System.out.println("Multiplication result: " + resultMultiply);

        ComplexOperation division = ComplexOperationFactory.createOperation("divide");
        ComplexNumber resultDivide = division.execute(a, b);
        System.out.println("Division result: " + resultDivide);
    }
}

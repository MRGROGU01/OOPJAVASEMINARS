package calculator;

public class ComplexOperationFactory {
    public static ComplexOperation createOperation(String type) {
        switch (type) {
            case "add":
                return new LoggingOperationDecorator(new Addition());
            case "multiply":
                return new LoggingOperationDecorator(new Multiplication());
            case "divide":
                return new LoggingOperationDecorator(new Division());
            default:
                throw new IllegalArgumentException("Unknown operation type");
        }
    }
}

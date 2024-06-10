package calculator;

import java.util.logging.Logger;

public class LoggingOperationDecorator implements ComplexOperation {
    private final ComplexOperation operation;
    private static final Logger logger = Logger.getLogger(LoggingOperationDecorator.class.getName());

    public LoggingOperationDecorator(ComplexOperation operation) {
        this.operation = operation;
    }

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = operation.execute(a, b);
        logger.info("Operation: " + operation.getClass().getSimpleName() +
                ", Operands: " + a + ", " + b +
                ", Result: " + result);
        return result;
    }
}

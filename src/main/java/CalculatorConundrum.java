import java.rmi.server.Operation;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        String result = "";

        switch (operation) {
            case "+":
                result = String.valueOf(operand1 + operand2);
                break;
            case "*":
                result = String.valueOf(operand1 * operand2);
                break;
            case "/":
                try {
                    result = String.valueOf(operand1 / operand2);
                } catch (ArithmeticException ex) {
                    // throw new IllegalOperationException("Division by zero is not allowed", ex);
                }
                break;

            default:
                // throw new IllegalOperationException("Operation '" + operation + "' does not
                // exist");
        }
        // "22 + 25 = 47"
        return operand1 + " " + operation + " " + operand2 + " = " + result;

    }

}

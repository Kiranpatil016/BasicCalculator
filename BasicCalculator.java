public class BasicCalculator {

    public float addition(float operand_1, float operand_2) {
        return (operand_1 + operand_2);
    }

    public float subtraction(float operand_1, float operand_2) {
        return (operand_1 - operand_2);
    }

    public float multiplication(float operand_1, float operand_2) {
        return (operand_1 * operand_2);
    }

    public float division(float operand_1, float operand_2) {
        if (operand_2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (operand_1 / operand_2);
    }

    public float square(float operand_1){
        return(operand_1*operand_1); // Closing brace was missing here
    }

    public static void main(String[] args) {
        float operand_1 = 10;
        float operand_2 = 5;
        BasicCalculator calc = new BasicCalculator();

        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("Result of addition is: " + add_result);

        float sub_result = calc.subtraction(operand_1, operand_2);
        System.out.println("Result of subtraction is: " + sub_result);

        float mul_result = calc.multiplication(operand_1, operand_2);
        System.out.println("Result of multiplication is: " + mul_result);

        float div_result = calc.division(operand_1, operand_2);
        System.out.println("Result of division is: " + div_result);

        float square_result = calc.square(operand_1);
        System.out.println("Result of square is: " + square_result);
    }
}
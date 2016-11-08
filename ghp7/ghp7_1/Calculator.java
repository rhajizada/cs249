/**
 * Created by hajizar on 11/2/2016.
 */
public class Calculator {
    public static double eval(String expr) throws InvalidExpressionException, Exception, NumberFormatException {
        String[] operands = new String[2];
        char operation = '/';
        Double operand1 = 0.0;
        Double operand2 = 0.0;
        try {
            if(expr.contains("+") || expr.contains("-")) {
                for (int i = 0; i < expr.length(); i++) {
                    if (expr.charAt(i) == '-') {
                        operands = expr.split("-");
                        operation = '-';
                    } else if (expr.charAt(i) == '+') {
                        expr = expr.replaceAll("[+]", "+");
                        operands = expr.split("[+]");
                        operation = '+';
                    }

                }
            }
            else{
                Exception ex = new Exception("Invalid Expression");
                throw ex;
            }

            try {
                operand1 = Double.parseDouble(operands[0]);
                operand2 = Double.parseDouble(operands[1]);

            }catch(NumberFormatException e){
                Exception ex = new Exception("Invalid Expression");
                throw ex;
            }
            if (operation == '-') {
                return operand1 - operand2;
            } else {
                return operand1 + operand2;

            }

        }  catch (Exception ex) {
            System.err.println(ex.toString());
            InvalidExpressionException e = new InvalidExpressionException("Invalid Expression", ex);
            throw e;
        }
    }
}

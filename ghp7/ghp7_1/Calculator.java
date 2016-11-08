/*  ghp7 part 1 Calculator Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class Calculator {
    public static double eval(String expr) throws InvalidExpressionException, Exception, NumberFormatException
    // eval method takes user input and calculates
    {
        String[] operands = new String[2]; // String array that will contain operands
        char operation = '/'; // operation between operands
        Double operand1 = 0.0; // operand number 1
        Double operand2 = 0.0; // operand number 2
        try {
            if(expr.contains("+") || expr.contains("-")) { //checks whether input has '-' or '+'
                for (int i = 0; i < expr.length(); i++) {
                    if (expr.charAt(i) == '-') {
                        operands = expr.split("-"); // splits input into operands
                        operation = '-';
                    } else if (expr.charAt(i) == '+') {
                        expr = expr.replaceAll("[+]", "+"); // splits input into operands
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
                /*
                Parses operands into double
                */
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

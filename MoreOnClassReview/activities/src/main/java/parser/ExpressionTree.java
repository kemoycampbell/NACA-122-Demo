package parser;

public class ExpressionTree {

    private static Expression buildExpressionTree(String expr) {
    // Local variables to hold parts of the expression
    Expression[] operands = {null, null};
    String operator = null;
    Expression expression = null;

    // Split the expression into parts
    String[] parts = expr.split(" ");
    for (String part : parts) {
        // Create constant
        if (part.matches("\\d+")) { // Check if part is a number
            operands[1] = new Constant(Double.parseDouble(part));
        }
        // Store operator
        else {
            operator = part;
        }

        // Build the expression tree
        if (operator != null) {
            if (operands[0] == null && !operator.equals("++") && !operator.equals("--")){
                // First operand for a binary operator
                operands[0] = operands[1];
            } else {
                // Unary operators
                if (operator.equals("++") || operator.equals("--")) {
                    if (operator.equals("++")) {
                        expression = new Increment(operands[1]);
                    } else {
                        expression = new Decrement(operands[1]);
                    }
                } 
                // Binary operators
                else {
                    Expression leftValue = operands[0];
                    Expression rightValue = operands[1];
                    
                    switch(operator){
                        case "+":
                            expression = new Addition(leftValue, rightValue);
                            break;
                        case "-":
                            expression = new Subtraction(leftValue, rightValue);
                            break;
                        case "*":
                            expression = ()-> leftValue.evaluate() * rightValue.evaluate();
                            break;
                        case "/":
                            expression = ()-> leftValue.evaluate() / rightValue.evaluate();
                    }
                    
                    // if (operator.equals("+")) {
                    //     expression = new Addition(leftValue, rightValue);
                    // } else if (operator.equals("-")) {
                    //     expression = new Subtraction(leftValue, rightValue);
                    // } else if (operator.equals("*")) {
                    //     expression = ()-> leftValue.evaluate() * rightValue.evaluate();

                    // } else if (operator.equals("/")) {
                    //     expression = ()-> leftValue.evaluate() / rightValue.evaluate();
                    // }
        
                }
                operands[0] = null;
                operands[1] = expression;
                operator = null;
            }
        }
    }
    return expression;
}

    public static void main(String[] args) {

        Constant c3 = new Constant(3);
        Increment inc = new Increment(c3);

        Constant c5 = new Constant(5);
        Decrement dec = new Decrement(c5);

        Subtraction sub = new Subtraction(inc, dec);

        Addition addition = new Addition(sub, dec);
        System.out.println(addition.evaluate());

        Expression exprTree = buildExpressionTree("12 ++ - 5 + 20 -- ");
        System.out.println(exprTree.evaluate());
		
		exprTree = buildExpressionTree("* 3 7");
		System.out.println(exprTree.evaluate());
		
		exprTree = buildExpressionTree("/ 12 8");
		System.out.println(exprTree.evaluate());
    }
    
}

package parser;

public class Subtraction implements Expression {

    private final Expression num1;
    private final Expression num2;

    public Subtraction(Expression num1, Expression num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double evaluate() {
        return this.num1.evaluate() - this.num2.evaluate();
    }
    
}

package parser;

public class Decrement implements Expression
{
    private final Expression expression;

    public Decrement(Expression expression)
    {
        this.expression = expression;
    }

    @Override
    public double evaluate() {
        return this.expression.evaluate() - 1;
    }

    

    

}

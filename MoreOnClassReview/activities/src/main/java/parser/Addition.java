package parser;

public class Addition implements Expression{

    private final Expression num1;
    private final Expression num2;


    public Addition(Expression num1, Expression num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double evaluate() {
        return num1.evaluate() + num2.evaluate();
    }
    
}

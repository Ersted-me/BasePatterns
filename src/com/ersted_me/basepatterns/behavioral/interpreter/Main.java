package com.ersted_me.basepatterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression exp1 = new TerminalExpression("Java");
        Expression exp2 = new TerminalExpression("Java Core");

        Expression andEx = new AndExpression(exp1, exp2);
        System.out.println(andEx.interpret("Java, Java Core"));
    }
}

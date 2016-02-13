package com.example.jsinterpreter;

/**
 * Created by Yuzhou on 2016/2/9.
 */
public class NumberLiteral extends ASTLeaf {
    public NumberLiteral(Token t) {
        super(t);
    }
    public int value() {
        return token().getNumber();
    }
}

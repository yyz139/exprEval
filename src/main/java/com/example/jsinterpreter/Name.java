package com.example.jsinterpreter;

/**
 * Created by Yuzhou on 2016/2/9.
 */
public class Name extends ASTLeaf {
    public Name(Token t) {
        super(t);
    }
    public String name() {
        return token().getText();
    }
}

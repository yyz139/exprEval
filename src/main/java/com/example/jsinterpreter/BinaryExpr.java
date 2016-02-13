package com.example.jsinterpreter;

import java.util.List;

/**
 * Created by Yuzhou on 2016/2/9.
 */
public class BinaryExpr extends ASTList {
    public BinaryExpr(List<ASTree> c) {
        super(c);
    }
    public ASTree left() {
        return child(0);
    }
    public String operator() {
        return ((ASTLeaf)child(1)).token().getText();
    }
    public ASTree right() {
        return child(2);
    }
}

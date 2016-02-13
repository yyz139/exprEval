package com.example.jsinterpreter;

import java.util.Iterator;

/**
 * Created by Yuzhou on 2016/2/9.
 */
public abstract class ASTree {

    public abstract ASTree child(int i);
    public abstract int numChildren();
    public abstract Iterator<ASTree> children();
    public abstract String location();
    public Iterator<ASTree> iterator() {
        return children();
    }
}

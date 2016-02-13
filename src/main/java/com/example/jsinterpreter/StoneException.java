package com.example.jsinterpreter;

/**
 * Created by Yuzhou on 2016/2/9.
 */
public class StoneException extends RuntimeException {
    public StoneException(String m) {
        super(m);
    }
    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }
}

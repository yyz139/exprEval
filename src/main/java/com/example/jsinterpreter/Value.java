package com.example.jsinterpreter;

import java.awt.*;

/**
 * Created by Yuzhou on 2016/2/13.
 */
public class Value {

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        //convert int to double automatically
        if (isDouble() || isInteger()) {
            return (Double) value;
        } else {
            throw new InterpreterException("invalid type, need int or double");
        }
    }

    public Integer asInteger() {
        if (isInteger()) {
            return (Integer) value;
        } else if (isDouble()) {
            //maybe lost accuracy
            return ((Double)value).intValue();
        } else {
            throw new InterpreterException("invalid type, need int or double");
        }
    }
    public String asString() {
        return (String)value;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }
    public boolean isInteger() {
        return value instanceof Integer;
    }

    public Value add(Value right) {
        if (this.isDouble() || right.isDouble()) {
            return new Value(this.asDouble() + right.asDouble());
        } else {
            return new Value(this.asInteger() + right.asInteger());
        }
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

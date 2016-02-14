package com.example.jsinterpreter;

import java.util.List;
import java.util.Map;

/**
 * Created by Yuzhou on 2016/2/13.
 */
public class Value {
    private static final double SMALL_VALUE = 0.000000000001;

    private final Object value;

    public Value(Object value) {
        this.value = value;
    }
    //--------------------------as methods--------------------------
    public Boolean asBoolean() {
        return (Boolean)value;
    }
    public Double asDouble() {
        return (Double) value;
    }
    public String asString() {
        return (String)value;
    }
    public Map<String, Object> asMap() {
        return (Map<String, Object>)value;
    }
    public List<Value> asList() {
        return (List<Value>)value;
    }
    //------------------------value modifier-------------------------
    public Value inverse() {
        if (isBoolean()) {
            return new Value(!asBoolean());
        } else {
            throw new InterpreterException("inverse(): need boolean");
        }
    }
    public Value unaryMinus() {
        if (isDouble()) {
            return new Value(-asDouble());
        } else {
            throw new InterpreterException("inverse(): need double");
        }
    }
    public Value unaryPlus() {
        if (isDouble()) {
            return new Value(+asDouble());
        } else {
            throw new InterpreterException("inverse(): need double");
        }
    }
    //-----------------------checking methods---------------------
    public boolean isBoolean() {
        return value instanceof Boolean;
    }
    public boolean isDouble() {
        return value instanceof Double;
    }
    public boolean isMap() {
        return value instanceof Map;
    }
    public boolean isList() {
        return value instanceof List;
    }
    public boolean isString() {
        return value instanceof String;
    }
    public boolean isZero() {
        if (isDouble()) {
            return ((Double) value) == 0;
        } else {
            throw new InterpreterException("isZero(): need double");
        }
    }
    public boolean isTrue() {
        return asBoolean() == true;
    }
    public boolean isFalse() {
        return asBoolean() == false;
    }

    //--------------------------operations-----------------
    public Value add(Value right) {
        if (this.isDouble() && right.isDouble()) {
            return new Value(this.asDouble() + right.asDouble());
        } else if (isString() && right.isString()) {
            return new Value(asString() + right.asString());
        } else {
            throw new InterpreterException("add(): need double|String");
        }
    }
    public Value minus(Value right) {
        if (this.isDouble() && right.isDouble()) {
            return new Value(this.asDouble() - right.asDouble());
        } else {
            throw new InterpreterException("minus(): need double");
        }
    }
    public Value multiply(Value right) {
        if (this.isDouble() && right.isDouble()) {
            return new Value(this.asDouble() * right.asDouble());
        } else {
            throw new InterpreterException("multiply(): need double");
        }
    }
    public Value divide(Value right) {
        if (right.isZero()) {
            throw new InterpreterException("divide by zero");
        }
        if (this.isDouble() && right.isDouble()) {
            return new Value(this.asDouble() / right.asDouble());
        } else {
            throw new InterpreterException("divide(): need double");
        }
    }
    public Value modulus(Value right) {
        if (right.isZero()) {
            throw new InterpreterException("divide by zero");
        }
        if (this.isDouble() || right.isDouble()) {
            return new Value(this.asDouble() % right.asDouble());
        } else {
            throw new InterpreterException("modulus(): need double");
        }
    }
    //---------------------------relational operations------------------
    public Value moreThan(Value right) {
        if (isDouble() && right.isDouble()) {
            return new Value(asDouble() > right.asDouble());
        } else {
            throw new InterpreterException("logicalOr(): need left is double, right is double");
        }
    }
    public Value lessThan(Value right) {
        if (isDouble() && right.isDouble()) {
            return new Value(asDouble() < right.asDouble());
        } else {
            throw new InterpreterException("logicalOr(): need left is double, right is double");
        }
    }
    public Value equals(Value right) {
        if (isDouble() && right.isDouble()) {
            return new Value(asDouble() - right.asDouble() < SMALL_VALUE);
        } else if (isBoolean() && right.isBoolean()){
            return new Value(asBoolean() == right.asBoolean());
        } else {
            throw new InterpreterException("logicalOr(): need left is boolean|double, right is boolean|double");
        }
    }
    //-----------------------------logical-----------------------
    public Value logicalOr(Value right) {
        if (isBoolean() && right.isBoolean()) {
            return new Value(asBoolean() || right.asBoolean());
        } else {
            throw new InterpreterException("logicalOr(): need left is boolean, right is boolean");
        }
    }
    public Value logicalAnd(Value right) {
        if (isBoolean() && right.isBoolean()) {
            return new Value(asBoolean() && right.asBoolean());
        } else {
            throw new InterpreterException("logicalAnd(): need left is boolean, right is boolean");
        }
    }
    //---------------------------member access--------------------
    public Value memberDot(Value right) {
        if (isMap() && right.isString()) {
            return new Value(asMap().get(right.asString()));
        } else {
            throw new InterpreterException("memberDot(): need left is Map, right is String");
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

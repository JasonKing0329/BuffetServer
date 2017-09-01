package com.app.buffet;

public class ObjectFormatter {

    public static double getDouble(Object item) {
        if (item instanceof Integer) {
            return (double) ((int) item);
        }
        else if (item instanceof Long) {
            return (double) ((long) item);
        }
        else {
            return (double) item;
        }
    }
}

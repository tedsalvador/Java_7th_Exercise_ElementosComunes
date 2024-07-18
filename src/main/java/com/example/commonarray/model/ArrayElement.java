package com.example.commonarray.model;

public class ArrayElement {
    private int value;
    private int position1;
    private int position2;

    public ArrayElement(int value, int position1, int position2) {
        this.value = value;
        this.position1 = position1;
        this.position2 = position2;
    }

    public int getValue() {
        return value;
    }

    public int getPosition1() {
        return position1;
    }

    public int getPosition2() {
        return position2;
    }

    @Override
    public String toString() {
        return "Valor: " + value + ", Posición en Array1: " + position1 + ", Posición en Array2: " + position2;
    }
}

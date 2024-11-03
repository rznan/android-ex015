package br.com.renan.ex015.model;

/**
 * @author: renan santos carvalho
 */
public class Circle extends Shape {
    private float radious;

    public Circle(float radious) {
        this.radious = radious;
    }

    public float getRadious() {
        return radious;
    }

    public void setRadious(float radious) {
        this.radious = radious;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                '}';
    }
}

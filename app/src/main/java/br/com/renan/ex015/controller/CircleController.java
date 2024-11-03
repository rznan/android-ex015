package br.com.renan.ex015.controller;

import br.com.renan.ex015.model.Circle;

/**
 * @author: renan santos carvalho
 */
public class CircleController implements IGeometryController<Circle> {
    @Override
    public float calculateArea(Circle circle) {
        return (float) (Math.PI * Math.pow(circle.getRadious(), 2));
    }

    @Override
    public float calculatePerimeter(Circle circle) {
        return (float) (2 * Math.PI * circle.getRadious());
    }
}

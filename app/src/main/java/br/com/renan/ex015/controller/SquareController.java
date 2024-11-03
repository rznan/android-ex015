package br.com.renan.ex015.controller;

import br.com.renan.ex015.model.Rectangle;

/**
 * @author: renan santos carvalho
 */
public class SquareController implements IGeometryController<Rectangle> {

    @Override
    public float calculateArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getBase();
    }

    @Override
    public float calculatePerimeter(Rectangle rectangle) {
        return rectangle.getBase() * 2 + rectangle.getHeight() * 2;
    }
}

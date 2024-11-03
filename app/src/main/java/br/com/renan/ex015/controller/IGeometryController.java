package br.com.renan.ex015.controller;

/**
 * @author: renan santos carvalho
 */
public interface IGeometryController<T> {
    public float calculateArea(T t);
    public float calculatePerimeter(T t);
}

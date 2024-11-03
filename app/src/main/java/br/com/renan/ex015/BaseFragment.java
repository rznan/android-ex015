package br.com.renan.ex015;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.renan.ex015.controller.IGeometryController;
import br.com.renan.ex015.model.Shape;

/**
 * @author: renan santos carvalho
 */
public abstract class BaseFragment<T extends Shape> extends Fragment {

    protected View view;

    public abstract void findViews();
    public abstract void clearFields();
    public abstract int getFragmentId();
    public abstract T getShape();
    public abstract IGeometryController<T> getGeometryController();
    public abstract TextView getResultTextview();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.view = inflater.inflate(getFragmentId(), container, false);
        findViews();
        return view;
    }

    public void calculateArea() {
        IGeometryController<T> geometryController = getGeometryController();
        T shape = getShape();
        getResultTextview().setText(String.valueOf(geometryController.calculateArea(shape)));
        clearFields();
    }

    public void calculatePerimeter() {
        IGeometryController<T> geometryController = getGeometryController();
        T shape = getShape();
        getResultTextview().setText(String.valueOf(geometryController.calculatePerimeter(shape)));
        clearFields();
    }
}
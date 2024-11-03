package br.com.renan.ex015;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.renan.ex015.controller.CircleController;
import br.com.renan.ex015.controller.IGeometryController;
import br.com.renan.ex015.controller.SafeParser;
import br.com.renan.ex015.model.Circle;

/**
 * @author: renan santos carvalho
 */
public class CircleFragment extends BaseFragment<Circle> {

    private EditText edRadious;
    private TextView tvResult;

    @Override
    public void findViews() {
        edRadious = view.findViewById(R.id.edHeight);
        tvResult = view.findViewById(R.id.tvResult);
        Button btnPerimeter = view.findViewById(R.id.btnPerimeter);
        Button btnArea = view.findViewById(R.id.btnArea);

        btnPerimeter.setOnClickListener(e -> calculatePerimeter());
        btnArea.setOnClickListener(e -> calculateArea());
    }

    @Override
    public void clearFields() {
        this.edRadious.setText("");
    }

    @Override
    public int getFragmentId() {
        return R.layout.fragment_circle;
    }

    @Override
    public Circle getShape() {
        float raio = SafeParser.safeParseFloat(this.edRadious.getText().toString(), -1);
        return new Circle(raio);
    }

    @Override
    public IGeometryController<Circle> getGeometryController() {
        return new CircleController();
    }

    @Override
    public TextView getResultTextview() {
        return this.tvResult;
    }
}
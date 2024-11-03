package br.com.renan.ex015;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.renan.ex015.controller.IGeometryController;
import br.com.renan.ex015.controller.SafeParser;
import br.com.renan.ex015.controller.SquareController;
import br.com.renan.ex015.model.Rectangle;

/**
 * @author: renan santos carvalho
 */
public class SquareFragment extends BaseFragment<Rectangle> {

    private TextView tvResult;
    private EditText edHeight;
    private EditText edLenght;

    @Override
    public void findViews() {
        tvResult = view.findViewById(R.id.tvResult);
        edHeight = view.findViewById(R.id.edHeight);
        edLenght = view.findViewById(R.id.edLenght);

        Button btnArea = view.findViewById(R.id.btnArea);
        Button btnPerimeter = view.findViewById(R.id.btnPerimeter);

        btnPerimeter.setOnClickListener(e -> calculatePerimeter());
        btnArea.setOnClickListener(e -> calculateArea());
    }

    @Override
    public void clearFields() {
        this.edHeight.setText("");
        this.edLenght.setText("");
    }

    @Override
    public int getFragmentId() {
        return R.layout.fragment_square;
    }

    @Override
    public Rectangle getShape() {
        float l = SafeParser.safeParseFloat(this.edHeight.getText().toString(), -1);
        float h = SafeParser.safeParseFloat(this.edLenght.getText().toString(), -1);
        return new Rectangle(l, h);
    }

    @Override
    public IGeometryController<Rectangle> getGeometryController() {
        return new SquareController();
    }

    @Override
    public TextView getResultTextview() {
        return this.tvResult;
    }
}
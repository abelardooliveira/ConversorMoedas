package com.example.abela.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue=(EditText) findViewById(R.id.edit_value);
        this.mViewHolder.textDolar= (TextView) findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro= (TextView) findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate= (Button) findViewById(R.id.button_calculate);

        this.mViewHolder.buttonCalculate.setOnClickListener(this);
        this.clearValues();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button_calculate){
           Double value = Double.valueOf(this.mViewHolder.editValue.getText().toString());
            this.mViewHolder.textDolar.setText(String.format("%.2f", value *3));
            this.mViewHolder.textEuro.setText(String.format("%.2f", value *4));

        }
    }
    private void clearValues(){

        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");

    }

    private static class ViewHolder{
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;

    }
}

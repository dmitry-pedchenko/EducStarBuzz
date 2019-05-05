package com.example.educstarbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkno";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = (int) getIntent().getExtras().get(EXTRA_DRINKNO); // приходит интент с именем EXTRA_DRINKNO
        Drink drink = Drink.drinks[drinkNo];

        ImageView imgView = (ImageView) findViewById(R.id.photo);
        imgView.setImageResource(drink.getImageResId());
        imgView.setContentDescription(drink.getName());

        TextView txtViewName = (TextView) findViewById(R.id.name);
        txtViewName.setText(drink.getName());

        TextView txtViewDescr = (TextView) findViewById(R.id.descrition);
        txtViewDescr.setText(drink.getDescription());


    }
}

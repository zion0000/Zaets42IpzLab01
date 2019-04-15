package com.example.zaets42ipzlab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = findViewById(R.id.spinner);
        TextView textView = findViewById(R.id.textView);
    }

    public void getDescription(View view) {
        int position = spinner.getSelectedItemPosition();
        String [] Description = getResources().getStringArray(R.array.professions_desc);
        textView.setText(Description[position]);
    }
}

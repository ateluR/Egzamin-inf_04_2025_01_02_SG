package com.example.egzamininf04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText etNumber;// findViewById(R.id.editTextNumber);
    private Button btnSubmit;
    private TextView tvWashResult;

    private Button btnToggle;
    private TextView tvVacuumStatus;

    private boolean isVacuumOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.button);
        tvWashResult = findViewById(R.id.textView4);

        btnToggle = findViewById(R.id.button2);
        tvVacuumStatus = findViewById(R.id.textView6);
        etNumber = findViewById(R.id.editTextNumber);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputStr = etNumber.getText().toString();
                if (!inputStr.isEmpty()) {
                    int number = Integer.parseInt(inputStr);
                    if (number >= 1 && number <= 12) {
                        tvWashResult.setText("Numer prania: " + number);
                        } else {
                        etNumber.setText("Podaj numer prania 1...12");
                        }
                    }
                }
        });

        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isVacuumOn = !isVacuumOn;
                if (isVacuumOn) {
                    btnToggle.setText("Wyłącz");
                    tvVacuumStatus.setText("Odkurzacz włączony");
                } else {
                    btnToggle.setText("Włącz");
                    tvVacuumStatus.setText("Odkurzacz wyłączony");
                }
            }
        });
    }
}

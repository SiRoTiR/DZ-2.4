package ru.samsung.itschool.book.equation243;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    // Вызывается при создании Активности
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализирует Активность.
        setContentView(R.layout.activity_main);
    }

    /** Вызывается при нажатии пользователем на кнопку Решить */
        public void solveEquation(View view) {
             // ax+b=c
            double a = Double.parseDouble( ((EditText)
                    findViewById(R.id.coefficient_a)).getText().toString());
            double b = Double.parseDouble( ((EditText)
                    findViewById(R.id.coefficient_b)).getText().toString());
            double c = Double.parseDouble( ((EditText)
                    findViewById(R.id.coefficient_c)).getText().toString());
            TextView result = (TextView) findViewById(R.id.result);
            TextView result2 = (TextView) findViewById(R.id.result2);
            Double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                result.setText(String.valueOf(x1));
                result2.setText(String.valueOf(x2));
            }
            else if (d == 0) {
                double x;
                x = -b / (2 * a);
                result.setText(String.valueOf(x));
            }
            else {
                result.setText("Данное уравнение не имеет корней");
            }

        }
        }



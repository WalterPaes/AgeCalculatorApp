package br.com.wpaes.agecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCalculate(View view) {
        EditText nameView = findViewById(R.id.name);
        String name = nameView.getText().toString();

        EditText birthdayView = findViewById(R.id.birthday);
        String birthday = birthdayView.getText().toString();

        Calculate calculate = new Calculate();
        int age = calculate.getAge(birthday);

        String message = "Olá, " + name +". \n" +
                "Você tem " + age + " anos.";

        Intent intent = new Intent(this, ShowNameAndAge.class);
        intent.putExtra(ShowNameAndAge.MESSAGE, message);
        startActivity(intent);
    }
}

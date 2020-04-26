package br.com.wpaes.agecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowNameAndAge extends AppCompatActivity {

    public static String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name_and_age);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(MESSAGE);

        TextView textView = findViewById(R.id.result);
        textView.setText(messageText);
    }
}
